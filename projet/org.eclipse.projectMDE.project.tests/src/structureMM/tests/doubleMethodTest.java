/**
 */
package structureMM.tests;

import junit.textui.TestRunner;

import structureMM.StructureMMFactory;
import structureMM.doubleMethod;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>double Method</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class doubleMethodTest extends MethodTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(doubleMethodTest.class);
	}

	/**
	 * Constructs a new double Method test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public doubleMethodTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this double Method test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected doubleMethod getFixture() {
		return (doubleMethod)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StructureMMFactory.eINSTANCE.createdoubleMethod());
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

} //doubleMethodTest
