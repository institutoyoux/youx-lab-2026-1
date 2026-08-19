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
