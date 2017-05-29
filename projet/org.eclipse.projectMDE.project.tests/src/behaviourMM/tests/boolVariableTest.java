/**
 */
package behaviourMM.tests;

import behaviourMM.BehaviourMMFactory;
import behaviourMM.boolVariable;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>bool Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class boolVariableTest extends VariableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(boolVariableTest.class);
	}

	/**
	 * Constructs a new bool Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolVariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this bool Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolVariable getFixture() {
		return (boolVariable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviourMMFactory.eINSTANCE.createboolVariable());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //boolVariableTest
