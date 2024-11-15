/**
 * 
 */


function confirmar(idAluno) {
	let resposta = confirm("Confirmar a exclusão do Aluno ? ");
	if (resposta === true){
		alert(idAluno);
	}
}