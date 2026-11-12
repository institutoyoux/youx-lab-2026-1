<<<<<<< HEAD
# 🎓 Repositório de Atividades - YouX Lab 2026-1

Bem-vindo(a) ao seu repositório oficial de estudos! 🚀

Este espaço foi organizado para que você armazene, organize e envie todas as atividades e projetos práticos que desenvolverá durante os cursos aqui no **Instituto YouX**.

---

## 🧠 O que são essas ferramentas?

* **O que é o Git?** É um sistema que controla as versões do seu código. Ele funciona como uma "máquina do tempo", salvando o histórico de tudo o que você escreve.
* **O que é um Repositório?** É a "pasta inteligente" onde o seu projeto fica guardado na nuvem.

---

## 🛠️ Configuração Inicial (Faça apenas uma vez)

### 1. Identificando seu usuário
Abra o seu terminal e digite os comandos abaixo:
```bash
git config --global user.name "Seu Nome Completo"
git config --global user.email "seuemail@exemplo.com"
```

### 2. Configurando a Chave SSH (Acesso Seguro)
**Gerar a chave:** 
```bash
ssh-keygen -t ed25519 -C "seuemail@exemplo.com"
``` 

**Copiar a chave:** 
```bash
cat ~/.ssh/id_ed25519.pub
``` 
(Copie o código que começa com `ssh-ed25519`).

**Cadastrar na Web:** Vá em Settings > SSH Keys no seu perfil (GitHub) e cole a chave lá.

---

## 🌿 Organização por Branches (Ramos)

Para que o trabalho de um aluno não interfira no de outro, utilizamos **Branches**. Uma branch é como um "espaço de trabalho individual" dentro do mesmo repositório.

**Cada aluno do Instituto YouX deve ter sua própria branch.**

### Como criar sua branch:
Na primeira vez que você for começar suas atividades, crie uma branch com o seu nome (use letras minúsculas e sem espaços):
```bash
# Cria e já entra na sua nova branch
git checkout -b seu-nome
```

### Como mudar de branch:
Se você precisar voltar para a branch principal ou alternar entre branches:
```bash
# Para voltar para a branch principal (main/master)
git checkout main

# Para voltar para a SUA branch
git checkout seu-nome
```

### Como saber em qual branch estou?
```bash
git branch
```
*(A branch com um asterisco `*` ao lado é a que você está usando no momento).*

---

## 🚀 Como enviar suas atividades (O Ciclo Git)

Sempre que terminar um exercício, certifique-se de que está na **sua branch** e siga estes passos:

### Passo 1: Preparar (`git add`)
```bash
git add .
```

### Passo 2: Salvar Localmente (`git commit`)
```bash
git commit -m "Atividade de Lógica de Programação concluída"
```

### Passo 3: Enviar para a Nuvem (`git push`)
Na primeira vez que enviar sua branch, use:
```bash
git push -u origin seu-nome
```
*(Nas próximas vezes, basta usar apenas `git push`).*

---

## 📌 Resumo da "Receita de Bolo"

1. Garanta que está na sua branch: `git checkout seu-nome`
2. Prepare: `git add .`
3. Salve: `git commit -m "Mensagem aqui"`
4. Envie: `git push`

**Bons estudos! Sua jornada no YouX Lab 2026-1 está apenas começando!** ✨
=======
# Getting Started with Create React App

This project was bootstrapped with [Create React App](https://github.com/facebook/create-react-app).

## Available Scripts

In the project directory, you can run:

### `npm start`

Runs the app in the development mode.\
Open [http://localhost:3000](http://localhost:3000) to view it in your browser.

The page will reload when you make changes.\
You may also see any lint errors in the console.

### `npm test`

Launches the test runner in the interactive watch mode.\
See the section about [running tests](https://facebook.github.io/create-react-app/docs/running-tests) for more information.

### `npm run build`

Builds the app for production to the `build` folder.\
It correctly bundles React in production mode and optimizes the build for the best performance.

The build is minified and the filenames include the hashes.\
Your app is ready to be deployed!

See the section about [deployment](https://facebook.github.io/create-react-app/docs/deployment) for more information.

### `npm run eject`

**Note: this is a one-way operation. Once you `eject`, you can't go back!**

If you aren't satisfied with the build tool and configuration choices, you can `eject` at any time. This command will remove the single build dependency from your project.

Instead, it will copy all the configuration files and the transitive dependencies (webpack, Babel, ESLint, etc) right into your project so you have full control over them. All of the commands except `eject` will still work, but they will point to the copied scripts so you can tweak them. At this point you're on your own.

You don't have to ever use `eject`. The curated feature set is suitable for small and middle deployments, and you shouldn't feel obligated to use this feature. However we understand that this tool wouldn't be useful if you couldn't customize it when you are ready for it.

## Learn More

You can learn more in the [Create React App documentation](https://facebook.github.io/create-react-app/docs/getting-started).

To learn React, check out the [React documentation](https://reactjs.org/).

### Code Splitting

This section has moved here: [https://facebook.github.io/create-react-app/docs/code-splitting](https://facebook.github.io/create-react-app/docs/code-splitting)

### Analyzing the Bundle Size

This section has moved here: [https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size](https://facebook.github.io/create-react-app/docs/analyzing-the-bundle-size)

### Making a Progressive Web App

This section has moved here: [https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app](https://facebook.github.io/create-react-app/docs/making-a-progressive-web-app)

### Advanced Configuration

This section has moved here: [https://facebook.github.io/create-react-app/docs/advanced-configuration](https://facebook.github.io/create-react-app/docs/advanced-configuration)

### Deployment

This section has moved here: [https://facebook.github.io/create-react-app/docs/deployment](https://facebook.github.io/create-react-app/docs/deployment)

### `npm run build` fails to minify

This section has moved here: [https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify](https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify)
>>>>>>> c745180 (Initialize project using Create React App)
