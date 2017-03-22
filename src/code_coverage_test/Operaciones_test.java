package code_coverage_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import code_coverage_operaciones.Operaciones;

public class Operaciones_test {
  
	@Test
	public void suma() {
		Operaciones operaciones = new Operaciones();
		Integer resultado;
		resultado = operaciones.OperationSelector(3, 4, 1);
		Assert.assertEquals(Integer.valueOf(7), resultado);
	}
	
	@Test
	public void resta() {
		Operaciones operaciones = new Operaciones();
		Integer resultado;
		resultado = operaciones.OperationSelector(3, 4, 2);
		Assert.assertEquals(Integer.valueOf(-1), resultado);
	}
}
