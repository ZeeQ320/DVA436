/**
 */
package behaviourMM.tests;

import behaviourMM.BehaviourMMFactory;
import behaviourMM.andOperator;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>and Operator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class andOperatorTest extends OperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(andOperatorTest.class);
	}

	/**
	 * Constructs a new and Operator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public andOperatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this and Operator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected andOperator getFixture() {
		return (andOperator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviourMMFactory.eINSTANCE.createandOperator());
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

} //andOperatorTest
