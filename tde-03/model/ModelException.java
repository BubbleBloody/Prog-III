/*
  Você até consegue colocar exceções manuais e individuais pelo código
  mas nós criamos uma classe pra cada exceção, justamente pro código ficar mais
  organizado e fácil de entender

  Aqui você criou uma classe genérica. Você acaba sempre usando esse método
  quando vai lançar uma exceção, o que perde o sentido da coisa

  E você também codificou pra que você sempre que chamar esse método no código
  precise passar uma string (que no caso seria a mensagem de erro)

  O ideal, é como falei no começo, criar uma classe específica pra cada excessão e já com
  o código ou a mensagem que você quer que seja executado quando chamar a excessão
  pro código ficar mais organizado
*/

/*
  Aqui eu fiz do jeito que está nos slides do Módulo III postado no classroom pela professora,
  lá diz sobre criar uma classe de nome ModelException que herda da classe Exception,
  não entendi muito o porquê criar uma classe que herda um método construtor que herda atributos
  de sua classe mãe, também não sei de que forma seria fazer do jeito que você mencionou criando
  uma classe para cada exceção 
 */

package model;

public class ModelException extends Exception{
	public ModelException(String msgErro) {
		super(msgErro);
	}
}