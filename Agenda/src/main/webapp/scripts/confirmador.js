/**
 * Confirmação de exlusao de um contato
 * 
 * @author Eduardo Santos
 * @param id_contato
 */

function confirmar(id_contato){
	let resposta = confirm("Confirma a exclusão deste contato?");
	
	if (resposta === true) {
		window.location.href = "deleteContato?id_contato=" + id_contato;
	}
}