/**
 */
package behaviourMM.tests;

import behaviourMM.BehaviourMMFactory;
import behaviourMM.superiorOperator;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>superior Operator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class superiorOperatorTest extends OperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(superiorOperatorTest.class);
	}

	/**
	 * Constructs a new superior Operator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public superiorOperatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this superior Operator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected superiorOperator getFixture() {
		return (superiorOperator)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BehaviourMMFactory.eINSTANCE.createsuperiorOperator());
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

} //superiorOperatorTest
