package br.edu.univas.si4.tp4.producao.model;

public class ProdutoException extends Exception{
	
	public ProdutoException(String message) {
		super(message);
	}

	public ProdutoException(Throwable cause) {
		super(cause);
	}

	public ProdutoException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProdutoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
