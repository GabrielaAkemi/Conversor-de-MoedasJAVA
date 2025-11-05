#  Conversor de Moedas em Java

Este é um projeto desenvolvido como parte de um desafio prático de programação pela Oracle e Alura.  
O objetivo é criar um **Conversor de Moedas** totalmente funcional, que consome uma **API de taxas de câmbio em tempo real** e permite ao usuário realizar conversões diretamente pelo **console**.

---

##  Funcionalidades

- Exibe um **menu interativo** com 6 opções de conversão:
  1. Dólar (USD) → Peso Argentino (ARS)  
  2. Peso Argentino (ARS) → Dólar (USD)  
  3. Dólar (USD) → Real Brasileiro (BRL)  
  4. Real Brasileiro (BRL) → Dólar (USD)  
  5. Dólar (USD) → Peso Colombiano (COP)  
  6. Peso Colombiano (COP) → Dólar (USD)

- Conversões **em tempo real** utilizando dados da API de câmbio.  
- Exibição dos resultados de forma clara e intuitiva.  
- Tratamento de entrada do usuário e opção de **sair do sistema**.

---

##  Estrutura do Projeto

ConversorDeMoedas/
│
├── src/
│ ├── Main.java # Classe principal com o menu interativo
│ ├── Moeda.java # Classe responsável pelos cálculos e exibição
│ ├── Auxiliar.java # Classe para comunicação com a API
│ ├── ConversionHistory.java # (opcional) histórico de conversões
│
└── README.md # Este arquivo

yaml
Copiar código

---

##  API Utilizada

O projeto utiliza uma API pública de câmbio (por exemplo):

https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/USD

yaml
Copiar código

> Substitua `YOUR-API-KEY` pela sua chave pessoal gratuita da [ExchangeRate API](https://www.exchangerate-api.com/).

---

