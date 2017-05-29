/**
 */
package structureMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see structureMM.StructureMMPackage
 * @generated
 */
public interface StructureMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructureMMFactory eINSTANCE = structureMM.impl.StructureMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class</em>'.
	 * @generated
	 */
	Class createClass();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>double Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>double Attribute</em>'.
	 * @generated
	 */
	doubleAttribute createdoubleAttribute();

	/**
	 * Returns a new object of class '<em>string Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>string Attribute</em>'.
	 * @generated
	 */
	stringAttribute createstringAttribute();

	/**
	 * Returns a new object of class '<em>char Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>char Attribute</em>'.
	 * @generated
	 */
	charAttribute createcharAttribute();

	/**
	 * Returns a new object of class '<em>bool Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>bool Attribute</em>'.
	 * @generated
	 */
	boolAttribute createboolAttribute();

	/**
	 * Returns a new object of class '<em>int Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>int Attribute</em>'.
	 * @generated
	 */
	intAttribute createintAttribute();

	/**
	 * Returns a new object of class '<em>int Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>int Method</em>'.
	 * @generated
	 */
	intMethod createintMethod();

	/**
	 * Returns a new object of class '<em>bool Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>bool Method</em>'.
	 * @generated
	 */
	boolMethod createboolMethod();

	/**
	 * Returns a new object of class '<em>char Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>char Method</em>'.
	 * @generated
	 */
	charMethod createcharMethod();

	/**
	 * Returns a new object of class '<em>string Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>string Method</em>'.
	 * @generated
	 */
	stringMethod createstringMethod();

	/**
	 * Returns a new object of class '<em>double Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>double Method</em>'.
	 * @generated
	 */
	doubleMethod createdoubleMethod();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StructureMMPackage getStructureMMPackage();

} //StructureMMFactory
