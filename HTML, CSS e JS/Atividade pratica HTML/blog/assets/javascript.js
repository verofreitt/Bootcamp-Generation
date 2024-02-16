function searchCharacters() {
  var input, filter, personagens, personagem, nome, i;
  input = document.getElementById('searchInput');
  filter = input.value.toUpperCase();
  personagens = document.querySelectorAll('.personagem');

  for (i = 0; i < personagens.length; i++) {
    personagem = personagens[i];
    nome = personagem.querySelector('.nome-personagem');
    if (nome.innerHTML.toUpperCase().indexOf(filter) > -1) {
      personagem.style.display = '';
    } else {
      personagem.style.display = 'none';
    }
  }
}
  
  
  
  