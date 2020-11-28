package universidade;

public class matricula {
	
	aluno aluno ;
	disciplina disciplina;
	
	private double prova1 ;
	private double prova2 ;
	
	private double substitutiva ;
	
	boolean isaprovado ;
	
	double getnotafinal ; 

	public boolean isIsaprovado() {
		return isaprovado;
	}

	public void setIsaprovado(boolean isaprovado) {
		this.isaprovado = isaprovado;
	}

	public double getGetnotafinal() {
		return getnotafinal;
	}

	public void setGetnotafinal(double getnotafinal) {
		this.getnotafinal = getnotafinal;
	}

	public aluno getAluno() {
		return aluno;
	}

	public void setAluno(aluno aluno) {
		this.aluno = aluno;
	}

	public disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public double getProva1() {
		return prova1;
	}

	public void setProva1(double prova1) {
		this.prova1 = prova1;
	}

	public double getProva2() {
		return prova2;
	}

	public void setProva2(double prova2) {
		this.prova2 = prova2;
	}

	public double getSubstitutiva() {
		return substitutiva;
	}

	public void setSubstitutiva(double substitutiva) {
		this.substitutiva = substitutiva;
	}
	
	

}
