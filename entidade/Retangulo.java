package retangulo.entidade;

public class Retangulo {

	public double largura;
	public double altura;
	
	public double area() {
		
		double a = largura * altura;
		return a;
		
	}
	
	public double perimetro() {
		
		double p = 2 *(largura + altura);
		return p;
		
	}
	
	public double diagonal() {
		
		double d = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
		return d;
	}
	
	
}

