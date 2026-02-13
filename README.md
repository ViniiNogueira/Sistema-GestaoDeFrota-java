## Sistema de Gestão de Frota - Java:

Este projeto é um simulador de gerenciamento de frotas desenvolvido em **Java**. O objetivo principal foi aplicar os fundamentos da Programação Orientada a Objetos (POO) em um cenário real de logística, controlando veículos, viagens e manutenções.

## Conceitos de POO utilizados:
Neste projeto, busquei demonstrar maturidade técnica através dos seguintes conceitos:

Abstração: A classe Veiculo foi definida como abstract, servindo como um contrato para as subclasses e impedindo a criação de veículos "genéricos".
Herança: As classes Caminhao e Moto estendem Veiculo, herdando atributos comuns (placa, modelo, consumo) e implementando características específicas (Capacidade de Carga vs. Cilindradas).
Polimorfismo: Utilizei um ArrayList<Veiculo> para armazenar diferentes tipos de objetos. No loop de execução, o Java identifica dinamicamente qual implementação de exibirDetalhes() deve ser chamada.
Encapsulamento e Regras de Negócio: Métodos como viajar() e abastecer() possuem travas lógicas que impedem ações impossíveis (exemplo: viajar sem combustível ou com o veículo em manutenção).

## Funcionalidades:

- Gerenciamento de Combustível: Controle de abastecimento respeitando a capacidade máxima do tanque.
- Simulador de Viagens: Cálculo de consumo baseado no rendimento (`km/L`) e atualização automática do odômetro.
- Estado dos veiculos: Controle de status do veículo (`Disponivel`, `Em_viagem`, `manutencao`).
- Bloqueio de Segurança: O sistema impede que veículos em manutenção realizem viagens.

## Contato e Feedback
Este projeto faz parte do meu aprendizado contínuo. Aceito críticas construtivas e dicas de melhoria! Se você viu algo que pode ser otimizado no código ou na estrutura, sinta-se à vontade para entrar em contato. Toda ajuda é bem-vinda para o meu crescimento como desenvolvedor.
Muito Obriagdo
