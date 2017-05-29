/**
 */
package structureMM.tests;

import junit.textui.TestRunner;

import structureMM.StructureMMFactory;
import structureMM.doubleAttribute;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>double Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class doubleAttributeTest extends AttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(doubleAttributeTest.class);
	}

	/**
	 * Constructs a new double Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public doubleAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this double Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected doubleAttribute getFixture() {
		return (doubleAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StructureMMFactory.eINSTANCE.createdoubleAttribute());
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

} //doubleAttributeTest
