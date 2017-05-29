/**
 */
package structureMM.tests;

import junit.textui.TestRunner;

import structureMM.StructureMMFactory;
import structureMM.stringMethod;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>string Method</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class stringMethodTest extends MethodTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(stringMethodTest.class);
	}

	/**
	 * Constructs a new string Method test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stringMethodTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this string Method test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected stringMethod getFixture() {
		return (stringMethod)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StructureMMFactory.eINSTANCE.createstringMethod());
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

} //stringMethodTest
