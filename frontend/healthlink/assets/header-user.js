(function () {
  function parseJwt(token) {
    try {
      const base64Payload = token.split('.')[1];
      if (!base64Payload) return {};
      return JSON.parse(atob(base64Payload.replace(/-/g, '+').replace(/_/g, '/')));
    } catch (erro) {
      console.warn('Não foi possível decodificar o token.', erro);
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
    if (!valor) return 'Administrador';
    return /^dr\.?/i.test(valor) ? valor : 'Dr. ' + valor;
  }

  function inicializarAvatar(nome) {
    const partes = (nome || 'Usuário').split(/\s+/).filter(Boolean);
    const iniciais = partes.slice(0, 2).map(function (parte) {
      return parte.charAt(0).toUpperCase();
    }).join('');
    return iniciais || 'US';
  }

  function atualizarHeader() {
    const usuarioSalvo = obterUsuarioSalvo();
    const token = localStorage.getItem('token');
    const payload = parseJwt(token || '');
    const nome = usuarioSalvo && usuarioSalvo.nome
      ? usuarioSalvo.nome
      : (payload.sub ? payload.sub.split('@')[0] : 'Administrador');
    const cargo = usuarioSalvo && usuarioSalvo.role ? usuarioSalvo.role : 'Administrador';

    document.querySelectorAll('.user-info strong').forEach(function (elemento) {
      if (elemento) elemento.textContent = normalizarNome(nome);
    });

    document.querySelectorAll('.user-info span').forEach(function (elemento) {
      if (elemento) elemento.textContent = cargo;
    });

    document.querySelectorAll('.avatar').forEach(function (elemento) {
      if (elemento) elemento.textContent = inicializarAvatar(nome);
    });
  }

  document.addEventListener('DOMContentLoaded', atualizarHeader);
  window.addEventListener('storage', atualizarHeader);
  atualizarHeader();
})();
