1 - Os princípios que não estão sendo respeitados são:

SRP: violado porque o sistema CheckoutService faz diversas tarefas, como por exemplo: inicia o pedido, calcula o total, aplica descontos, seleção de pagamento e etc.

OCP: violado porque o método de pagamento é feita via if/else, o que significa que ao adicionar mais um método de pagamento, o código-fonte precisaria ser editado e não apenas estendido.

ISP: violado porque não há separação entre Repository e Notifier, tudo está misturado no mesmo serviço, quando deveria existir pequenas interfaces para cada método.

DIP: violado porque o código depende diretamente de classes concretas, como por exemplo Database, enquanto ela deveria depender de interfaces abstratas.
