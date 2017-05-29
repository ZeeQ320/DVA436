/**
 */
package structureMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see structureMM.StructureMMFactory
 * @model kind="package"
 * @generated
 */
public interface StructureMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "structureMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.eclipse.projectMDE.project";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.projectMDE.project";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructureMMPackage eINSTANCE = structureMM.impl.StructureMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link structureMM.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureMM.impl.ClassImpl
	 * @see structureMM.impl.StructureMMPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Methods</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__METHODS = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTES = 2;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structureMM.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureMM.impl.PackageImpl
	 * @see structureMM.impl.StructureMMPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structureMM.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureMM.impl.AttributeImpl
	 * @see structureMM.impl.StructureMMPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structureMM.impl.doubleAttributeImpl <em>double Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureMM.impl.doubleAttributeImpl
	 * @see structureMM.impl.StructureMMPackageImpl#getdoubleAttribute()
	 * @generated
	 */
	int DOUBLE_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ATTRIBUTE__VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>double Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>double Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structureMM.impl.stringAttributeImpl <em>string Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureMM.impl.stringAttributeImpl
	 * @see structureMM.impl.StructureMMPackageImpl#getstringAttribute()
	 * @generated
	 */
	int STRING_ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE__VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>string Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>string Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structureMM.impl.charAttributeImpl <em>char Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureMM.impl.charAttributeImpl
	 * @see structureMM.impl.StructureMMPackageImpl#getcharAttribute()
	 * @generated
	 */
	int CHAR_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_ATTRIBUTE__VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>char Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>char Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structureMM.impl.boolAttributeImpl <em>bool Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureMM.impl.boolAttributeImpl
	 * @see structureMM.impl.StructureMMPackageImpl#getboolAttribute()
	 * @generated
	 */
	int BOOL_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_ATTRIBUTE__VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>bool Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>bool Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structureMM.impl.intAttributeImpl <em>int Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureMM.impl.intAttributeImpl
	 * @see structureMM.impl.StructureMMPackageImpl#getintAttribute()
	 * @generated
	 */
	int INT_ATTRIBUTE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_ATTRIBUTE__NAME = ATTRIBUTE__NAME;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_ATTRIBUTE__VALUE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>int Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>int Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_ATTRIBUTE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structureMM.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureMM.impl.MethodImpl
	 * @see structureMM.impl.StructureMMPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__INPUTS = 1;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__STATEMENT = 2;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link structureMM.impl.intMethodImpl <em>int Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureMM.impl.intMethodImpl
	 * @see structureMM.impl.StructureMMPackageImpl#getintMethod()
	 * @generated
	 */
	int INT_METHOD = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_METHOD__NAME = METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_METHOD__INPUTS = METHOD__INPUTS;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_METHOD__STATEMENT = METHOD__STATEMENT;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_METHOD__RETURN_TYPE = METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>int Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_METHOD_FEATURE_COUNT = METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>int Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_METHOD_OPERATION_COUNT = METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structureMM.impl.boolMethodImpl <em>bool Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureMM.impl.boolMethodImpl
	 * @see structureMM.impl.StructureMMPackageImpl#getboolMethod()
	 * @generated
	 */
	int BOOL_METHOD = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_METHOD__NAME = METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_METHOD__INPUTS = METHOD__INPUTS;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_METHOD__STATEMENT = METHOD__STATEMENT;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_METHOD__RETURN_TYPE = METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>bool Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_METHOD_FEATURE_COUNT = METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>bool Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_METHOD_OPERATION_COUNT = METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structureMM.impl.charMethodImpl <em>char Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureMM.impl.charMethodImpl
	 * @see structureMM.impl.StructureMMPackageImpl#getcharMethod()
	 * @generated
	 */
	int CHAR_METHOD = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_METHOD__NAME = METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_METHOD__INPUTS = METHOD__INPUTS;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_METHOD__STATEMENT = METHOD__STATEMENT;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_METHOD__RETURN_TYPE = METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>char Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_METHOD_FEATURE_COUNT = METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>char Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_METHOD_OPERATION_COUNT = METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structureMM.impl.stringMethodImpl <em>string Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureMM.impl.stringMethodImpl
	 * @see structureMM.impl.StructureMMPackageImpl#getstringMethod()
	 * @generated
	 */
	int STRING_METHOD = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_METHOD__NAME = METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_METHOD__INPUTS = METHOD__INPUTS;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_METHOD__STATEMENT = METHOD__STATEMENT;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_METHOD__RETURN_TYPE = METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>string Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_METHOD_FEATURE_COUNT = METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>string Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_METHOD_OPERATION_COUNT = METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link structureMM.impl.doubleMethodImpl <em>double Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see structureMM.impl.doubleMethodImpl
	 * @see structureMM.impl.StructureMMPackageImpl#getdoubleMethod()
	 * @generated
	 */
	int DOUBLE_METHOD = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_METHOD__NAME = METHOD__NAME;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_METHOD__INPUTS = METHOD__INPUTS;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_METHOD__STATEMENT = METHOD__STATEMENT;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_METHOD__RETURN_TYPE = METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>double Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_METHOD_FEATURE_COUNT = METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>double Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOUBLE_METHOD_OPERATION_COUNT = METHOD_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link structureMM.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see structureMM.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link structureMM.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see structureMM.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link structureMM.Class#getMethods <em>Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Methods</em>'.
	 * @see structureMM.Class#getMethods()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Methods();

	/**
	 * Returns the meta object for the containment reference list '{@link structureMM.Class#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see structureMM.Class#getAttributes()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Attributes();

	/**
	 * Returns the meta object for class '{@link structureMM.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see structureMM.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link structureMM.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see structureMM.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for class '{@link structureMM.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see structureMM.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link structureMM.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see structureMM.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for class '{@link structureMM.doubleAttribute <em>double Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>double Attribute</em>'.
	 * @see structureMM.doubleAttribute
	 * @generated
	 */
	EClass getdoubleAttribute();

	/**
	 * Returns the meta object for the attribute '{@link structureMM.doubleAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see structureMM.doubleAttribute#getValue()
	 * @see #getdoubleAttribute()
	 * @generated
	 */
	EAttribute getdoubleAttribute_Value();

	/**
	 * Returns the meta object for class '{@link structureMM.stringAttribute <em>string Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>string Attribute</em>'.
	 * @see structureMM.stringAttribute
	 * @generated
	 */
	EClass getstringAttribute();

	/**
	 * Returns the meta object for the attribute '{@link structureMM.stringAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see structureMM.stringAttribute#getValue()
	 * @see #getstringAttribute()
	 * @generated
	 */
	EAttribute getstringAttribute_Value();

	/**
	 * Returns the meta object for class '{@link structureMM.charAttribute <em>char Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>char Attribute</em>'.
	 * @see structureMM.charAttribute
	 * @generated
	 */
	EClass getcharAttribute();

	/**
	 * Returns the meta object for the attribute '{@link structureMM.charAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see structureMM.charAttribute#getValue()
	 * @see #getcharAttribute()
	 * @generated
	 */
	EAttribute getcharAttribute_Value();

	/**
	 * Returns the meta object for class '{@link structureMM.boolAttribute <em>bool Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>bool Attribute</em>'.
	 * @see structureMM.boolAttribute
	 * @generated
	 */
	EClass getboolAttribute();

	/**
	 * Returns the meta object for the attribute '{@link structureMM.boolAttribute#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see structureMM.boolAttribute#isValue()
	 * @see #getboolAttribute()
	 * @generated
	 */
	EAttribute getboolAttribute_Value();

	/**
	 * Returns the meta object for class '{@link structureMM.intAttribute <em>int Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>int Attribute</em>'.
	 * @see structureMM.intAttribute
	 * @generated
	 */
	EClass getintAttribute();

	/**
	 * Returns the meta object for the attribute '{@link structureMM.intAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see structureMM.intAttribute#getValue()
	 * @see #getintAttribute()
	 * @generated
	 */
	EAttribute getintAttribute_Value();

	/**
	 * Returns the meta object for class '{@link structureMM.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see structureMM.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link structureMM.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see structureMM.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link structureMM.Method#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see structureMM.Method#getInputs()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Inputs();

	/**
	 * Returns the meta object for the containment reference list '{@link structureMM.Method#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see structureMM.Method#getStatement()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Statement();

	/**
	 * Returns the meta object for class '{@link structureMM.intMethod <em>int Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>int Method</em>'.
	 * @see structureMM.intMethod
	 * @generated
	 */
	EClass getintMethod();

	/**
	 * Returns the meta object for the attribute '{@link structureMM.intMethod#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see structureMM.intMethod#getReturnType()
	 * @see #getintMethod()
	 * @generated
	 */
	EAttribute getintMethod_ReturnType();

	/**
	 * Returns the meta object for class '{@link structureMM.boolMethod <em>bool Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>bool Method</em>'.
	 * @see structureMM.boolMethod
	 * @generated
	 */
	EClass getboolMethod();

	/**
	 * Returns the meta object for the attribute '{@link structureMM.boolMethod#isReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see structureMM.boolMethod#isReturnType()
	 * @see #getboolMethod()
	 * @generated
	 */
	EAttribute getboolMethod_ReturnType();

	/**
	 * Returns the meta object for class '{@link structureMM.charMethod <em>char Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>char Method</em>'.
	 * @see structureMM.charMethod
	 * @generated
	 */
	EClass getcharMethod();

	/**
	 * Returns the meta object for the attribute '{@link structureMM.charMethod#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see structureMM.charMethod#getReturnType()
	 * @see #getcharMethod()
	 * @generated
	 */
	EAttribute getcharMethod_ReturnType();

	/**
	 * Returns the meta object for class '{@link structureMM.stringMethod <em>string Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>string Method</em>'.
	 * @see structureMM.stringMethod
	 * @generated
	 */
	EClass getstringMethod();

	/**
	 * Returns the meta object for the attribute '{@link structureMM.stringMethod#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see structureMM.stringMethod#getReturnType()
	 * @see #getstringMethod()
	 * @generated
	 */
	EAttribute getstringMethod_ReturnType();

	/**
	 * Returns the meta object for class '{@link structureMM.doubleMethod <em>double Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>double Method</em>'.
	 * @see structureMM.doubleMethod
	 * @generated
	 */
	EClass getdoubleMethod();

	/**
	 * Returns the meta object for the attribute '{@link structureMM.doubleMethod#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see structureMM.doubleMethod#getReturnType()
	 * @see #getdoubleMethod()
	 * @generated
	 */
	EAttribute getdoubleMethod_ReturnType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructureMMFactory getStructureMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link structureMM.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureMM.impl.ClassImpl
		 * @see structureMM.impl.StructureMMPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__METHODS = eINSTANCE.getClass_Methods();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ATTRIBUTES = eINSTANCE.getClass_Attributes();

		/**
		 * The meta object literal for the '{@link structureMM.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureMM.impl.PackageImpl
		 * @see structureMM.impl.StructureMMPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '{@link structureMM.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureMM.impl.AttributeImpl
		 * @see structureMM.impl.StructureMMPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '{@link structureMM.impl.doubleAttributeImpl <em>double Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureMM.impl.doubleAttributeImpl
		 * @see structureMM.impl.StructureMMPackageImpl#getdoubleAttribute()
		 * @generated
		 */
		EClass DOUBLE_ATTRIBUTE = eINSTANCE.getdoubleAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_ATTRIBUTE__VALUE = eINSTANCE.getdoubleAttribute_Value();

		/**
		 * The meta object literal for the '{@link structureMM.impl.stringAttributeImpl <em>string Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureMM.impl.stringAttributeImpl
		 * @see structureMM.impl.StructureMMPackageImpl#getstringAttribute()
		 * @generated
		 */
		EClass STRING_ATTRIBUTE = eINSTANCE.getstringAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ATTRIBUTE__VALUE = eINSTANCE.getstringAttribute_Value();

		/**
		 * The meta object literal for the '{@link structureMM.impl.charAttributeImpl <em>char Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureMM.impl.charAttributeImpl
		 * @see structureMM.impl.StructureMMPackageImpl#getcharAttribute()
		 * @generated
		 */
		EClass CHAR_ATTRIBUTE = eINSTANCE.getcharAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_ATTRIBUTE__VALUE = eINSTANCE.getcharAttribute_Value();

		/**
		 * The meta object literal for the '{@link structureMM.impl.boolAttributeImpl <em>bool Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureMM.impl.boolAttributeImpl
		 * @see structureMM.impl.StructureMMPackageImpl#getboolAttribute()
		 * @generated
		 */
		EClass BOOL_ATTRIBUTE = eINSTANCE.getboolAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_ATTRIBUTE__VALUE = eINSTANCE.getboolAttribute_Value();

		/**
		 * The meta object literal for the '{@link structureMM.impl.intAttributeImpl <em>int Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureMM.impl.intAttributeImpl
		 * @see structureMM.impl.StructureMMPackageImpl#getintAttribute()
		 * @generated
		 */
		EClass INT_ATTRIBUTE = eINSTANCE.getintAttribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_ATTRIBUTE__VALUE = eINSTANCE.getintAttribute_Value();

		/**
		 * The meta object literal for the '{@link structureMM.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureMM.impl.MethodImpl
		 * @see structureMM.impl.StructureMMPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__INPUTS = eINSTANCE.getMethod_Inputs();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__STATEMENT = eINSTANCE.getMethod_Statement();

		/**
		 * The meta object literal for the '{@link structureMM.impl.intMethodImpl <em>int Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureMM.impl.intMethodImpl
		 * @see structureMM.impl.StructureMMPackageImpl#getintMethod()
		 * @generated
		 */
		EClass INT_METHOD = eINSTANCE.getintMethod();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_METHOD__RETURN_TYPE = eINSTANCE.getintMethod_ReturnType();

		/**
		 * The meta object literal for the '{@link structureMM.impl.boolMethodImpl <em>bool Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureMM.impl.boolMethodImpl
		 * @see structureMM.impl.StructureMMPackageImpl#getboolMethod()
		 * @generated
		 */
		EClass BOOL_METHOD = eINSTANCE.getboolMethod();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_METHOD__RETURN_TYPE = eINSTANCE.getboolMethod_ReturnType();

		/**
		 * The meta object literal for the '{@link structureMM.impl.charMethodImpl <em>char Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureMM.impl.charMethodImpl
		 * @see structureMM.impl.StructureMMPackageImpl#getcharMethod()
		 * @generated
		 */
		EClass CHAR_METHOD = eINSTANCE.getcharMethod();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_METHOD__RETURN_TYPE = eINSTANCE.getcharMethod_ReturnType();

		/**
		 * The meta object literal for the '{@link structureMM.impl.stringMethodImpl <em>string Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureMM.impl.stringMethodImpl
		 * @see structureMM.impl.StructureMMPackageImpl#getstringMethod()
		 * @generated
		 */
		EClass STRING_METHOD = eINSTANCE.getstringMethod();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_METHOD__RETURN_TYPE = eINSTANCE.getstringMethod_ReturnType();

		/**
		 * The meta object literal for the '{@link structureMM.impl.doubleMethodImpl <em>double Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see structureMM.impl.doubleMethodImpl
		 * @see structureMM.impl.StructureMMPackageImpl#getdoubleMethod()
		 * @generated
		 */
		EClass DOUBLE_METHOD = eINSTANCE.getdoubleMethod();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOUBLE_METHOD__RETURN_TYPE = eINSTANCE.getdoubleMethod_ReturnType();

	}

} //StructureMMPackage
