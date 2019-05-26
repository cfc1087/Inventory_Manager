$(document).on('show.bs.modal', '#editForm', function(event) {
	var baseUrl = window.location.href;
	var button = $(event.relatedTarget) // Button that triggered the modal
	if (button.attr('id') == "editBtn") {
		var href = button.attr('href')
		var product = button.data('object-id')
		$.get(href, function(product) {
			$('.modal-header  #mTitle').text('Update Product');
			$('#myForm').attr("action", baseUrl + "/save");
			$('.modal-body #id').val(product.id);
			$('.modal-body #name').val(product.name);
			$('.modal-body #price').val(product.price);
		})// __${#httpServletRequest.requestURI}__
	}
	if (button.attr('id') == "newBtn") {
		$('.modal-header #mTitle').text('Add New Product');
		$('#myForm').attr("action", baseUrl + "/new");
		$('.modal-body #id').val('');
		$('.modal-body #name').val('');
		$('.modal-body #price').val('');

	}
	var modal = $(this)

})