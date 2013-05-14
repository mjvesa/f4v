package com.github.mjvesa.f4v;

/**
 * BaseWord is an atomic word that is installed into the interpreter state.
 * 
 * @author mjvesa@vaadin.com
 * 
 */
public abstract class BaseWord extends Word {

	public abstract void execute(Interpreter interpreter);

}
