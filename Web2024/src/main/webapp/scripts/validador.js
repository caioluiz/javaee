/**
 * 
 */

function validar() {
	let nome = frmAluno.nome.value
	let matricula = frmAluno.matricula.value
	
	if(nome === "") {
		alert('Preencha o campo Nome.')
		frmAluno.nome.focus()
		return false
	} else if (matricula === "") {
		alert('Preencha o campo Matricula.')
		frmAluno.matricula.focus()
		return false
	} else {
		document.forms["frmAluno"].submit()
	}
}