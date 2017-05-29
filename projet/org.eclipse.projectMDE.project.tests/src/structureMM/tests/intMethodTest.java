/**
 */
package structureMM.tests;

import junit.textui.TestRunner;

import structureMM.StructureMMFactory;
import structureMM.intMethod;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>int Method</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class intMethodTest extends MethodTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(intMethodTest.class);
	}

	/**
	 * Constructs a new int Method test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public intMethodTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this int Method test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected intMethod getFixture() {
		return (intMethod)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StructureMMFactory.eINSTANCE.createintMethod());
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

} //intMethodTest
