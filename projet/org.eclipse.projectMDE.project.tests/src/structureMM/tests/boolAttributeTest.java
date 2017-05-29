/**
 */
package structureMM.tests;

import junit.textui.TestRunner;

import structureMM.StructureMMFactory;
import structureMM.boolAttribute;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>bool Attribute</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class boolAttributeTest extends AttributeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(boolAttributeTest.class);
	}

	/**
	 * Constructs a new bool Attribute test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolAttributeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this bool Attribute test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolAttribute getFixture() {
		return (boolAttribute)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StructureMMFactory.eINSTANCE.createboolAttribute());
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

} //boolAttributeTest
