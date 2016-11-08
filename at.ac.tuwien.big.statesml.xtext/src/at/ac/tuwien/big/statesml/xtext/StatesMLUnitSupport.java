package at.ac.tuwien.big.statesml.xtext;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class StatesMLUnitSupport extends AbstractGenericResourceSupport {

	@Override
	protected Module createGuiceModule() {
		return new StatesMLRuntimeModule();
	}

}
