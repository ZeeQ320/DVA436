/**
 */
package behaviourMM.tests;

import behaviourMM.BehaviourMMFactory;
import behaviourMM.intVariable;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>int Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class intVariableTest extends VariableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(intVariableTest.class);
	}

	/**
	 * Constructs a new int Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public intVariableTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this int Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected intVariable getFixture() {
		return (intVariable)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviourMMFactory.eINSTANCE.createintVariable());
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

} //intVariableTest
