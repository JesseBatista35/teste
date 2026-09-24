Em TQS, deu isso.
 
  "aud": "api://db5adb34-a4b7-4e51-b270-da47e68fb84c", 
  "iss": "https://sts.windows.net/23bc12fb-512d-4bc8-9d29-a2da7eb6d281/",
 
 
Só para comparativo, em DES:
"aud": "api://768909fd-d192-40f8-a766-ff4b841797e0", 
  "iss": "https://sts.windows.net/23bc12fb-512d-4bc8-9d29-a2da7eb6d281/",

  <img width="800" height="359" alt="image" src="https://github.com/user-attachments/assets/0dedb3c0-d18c-4c78-82f0-9f2fee57a6a2" />


vi na library de tqs que o api scope tá com esse valor default mesmo. o esperado pelo backend é esse que você mandou?
 
vou alterar aqui e testar se soluciona
 
Deu certo, Jesse Mouta Pereira Batista! Realmente era o scope. Ao alterar do Default para o que a api tava esperando, deu certo 
 
muito obrigado pelo apoio! 
 
