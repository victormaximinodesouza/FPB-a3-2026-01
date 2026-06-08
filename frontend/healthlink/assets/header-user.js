(function () {
  const LOGIN_URL = 'login.html';

  function parseJwt(token) {
    try {
      const base64Payload = token.split('.')[1];
      if (!base64Payload) return {};
      return JSON.parse(atob(base64Payload.replace(/-/g, '+').replace(/_/g, '/')));
    } catch (erro) {
      console.warn('Nao foi possivel decodificar o token.', erro);
      return {};
    }
  }

  function obterUsuarioSalvo() {
    try {
      return JSON.parse(localStorage.getItem('loggedUser') || 'null');
    } catch (erro) {
      return null;
    }
  }

  function normalizarNome(nome) {
    const valor = (nome || '').trim();
    return valor || 'Usuario';
  }

  function inicializarAvatar(nome) {
    const partes = (nome || 'Usuario').split(/\s+/).filter(Boolean);
    const iniciais = partes.slice(0, 2).map(function (parte) {
      return parte.charAt(0).toUpperCase();
    }).join('');
    return iniciais || 'US';
  }

  function criarBotaoLogin() {
    const link = document.createElement('a');
    link.className = 'login-callout';
    link.href = LOGIN_URL;
    link.setAttribute('aria-label', 'Fazer login ou cadastrar-se');
    link.innerHTML =
      '<span class="login-callout-icon"><i class="fa-regular fa-user"></i></span>' +
      '<span class="login-callout-text">Ol\u00e1, fa\u00e7a seu <strong>login</strong><br>';
    return link;
  }

  function criarPerfilUsuario() {
    const perfil = document.createElement('div');
    perfil.className = 'user-profile';
    perfil.innerHTML =
      '<div class="user-info">' +
        '<strong>Usuario</strong>' +
        '<span>Logado</span>' +
      '</div>' +
      '<div class="avatar">US</div>';
    return perfil;
  }

  function obterNomeUsuario(usuarioSalvo, payload) {
    if (usuarioSalvo) {
      return usuarioSalvo.nome || usuarioSalvo.name || usuarioSalvo.fullName || usuarioSalvo.email || '';
    }

    if (payload.name) return payload.name;
    if (payload.nome) return payload.nome;
    if (payload.sub) return payload.sub.split('@')[0];
    return '';
  }

  function obterCargoUsuario(usuarioSalvo, payload) {
    if (usuarioSalvo) {
      return usuarioSalvo.role || usuarioSalvo.cargo || usuarioSalvo.tipo || 'Logado';
    }

    return payload.role || payload.cargo || 'Logado';
  }

  function usuarioEstaLogado(usuarioSalvo, token) {
    return Boolean((usuarioSalvo && (usuarioSalvo.nome || usuarioSalvo.name || usuarioSalvo.email)) || token);
  }

  function mostrarBotaoLogin(headerUser) {
    const perfil = headerUser.querySelector('.user-profile');
    const botaoExistente = headerUser.querySelector('.login-callout');

    if (perfil) perfil.remove();
    if (!botaoExistente) headerUser.appendChild(criarBotaoLogin());
  }

  function mostrarPerfilLogado(headerUser, nome, cargo) {
    const botaoLogin = headerUser.querySelector('.login-callout');
    let perfil = headerUser.querySelector('.user-profile');

    if (botaoLogin) botaoLogin.remove();
    if (!perfil) {
      perfil = criarPerfilUsuario();
      headerUser.appendChild(perfil);
    }

    const nomeNormalizado = normalizarNome(nome);
    const cargoNormalizado = cargo || 'Logado';
    const nomeEl = perfil.querySelector('.user-info strong');
    const cargoEl = perfil.querySelector('.user-info span');
    const avatarEl = perfil.querySelector('.avatar');

    if (nomeEl) nomeEl.textContent = nomeNormalizado;
    if (cargoEl) cargoEl.textContent = cargoNormalizado;
    if (avatarEl) avatarEl.textContent = inicializarAvatar(nomeNormalizado);
  }

  function configurarLogout() {
    document.querySelectorAll('.logout a[href="login.html"]').forEach(function (link) {
      link.addEventListener('click', function () {
        localStorage.removeItem('token');
        localStorage.removeItem('loggedUser');
      });
    });
  }

  function atualizarHeader() {
    const usuarioSalvo = obterUsuarioSalvo();
    const token = localStorage.getItem('token');
    const payload = parseJwt(token || '');
    const nome = obterNomeUsuario(usuarioSalvo, payload);
    const cargo = obterCargoUsuario(usuarioSalvo, payload);
    const estaLogado = usuarioEstaLogado(usuarioSalvo, token);

    document.querySelectorAll('.header-user').forEach(function (headerUser) {
      if (estaLogado) {
        mostrarPerfilLogado(headerUser, nome, cargo);
      } else {
        mostrarBotaoLogin(headerUser);
      }
    });
  }

  document.addEventListener('DOMContentLoaded', function () {
    atualizarHeader();
    configurarLogout();
  });

  window.addEventListener('storage', atualizarHeader);
  atualizarHeader();
})();
