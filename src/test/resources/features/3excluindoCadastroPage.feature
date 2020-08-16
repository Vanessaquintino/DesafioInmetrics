#language:pt

Funcionalidade: excluindo cadastro

	@excluir
		Cenario: Realizar a exclusao do cadastro de Funcionario
		Dado quando eu eu estiver logado na pagina principal
		Quando eu clicar em pesquisar o funcionario
		E clicar em excluir 
		Entao o cadastro sera excluido com sucesso 