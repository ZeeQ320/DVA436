/**
 */
package behaviourMM.tests;

import behaviourMM.BehaviourMMFactory;
import behaviourMM.divisionOperator;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>division Operator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class divisionOperatorTest extends OperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(divisionOperatorTest.class);
	}

	/**
	 * Constructs a new division Operator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public divisionOperatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this division Operator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected divisionOperator getFixture() {
		return (divisionOperator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviourMMFactory.eINSTANCE.createdivisionOperator());
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

} //divisionOperatorTest
