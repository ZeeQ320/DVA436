/**
 */
package structureMM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import structureMM.StructureMMFactory;
import structureMM.StructureMMPackage;
import structureMM.boolAttribute;
import structureMM.boolMethod;
import structureMM.charAttribute;
import structureMM.charMethod;
import structureMM.doubleAttribute;
import structureMM.doubleMethod;
import structureMM.intAttribute;
import structureMM.intMethod;
import structureMM.stringAttribute;
import structureMM.stringMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureMMFactoryImpl extends EFactoryImpl implements StructureMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StructureMMFactory init() {
		try {
			StructureMMFactory theStructureMMFactory = (StructureMMFactory)EPackage.Registry.INSTANCE.getEFactory(StructureMMPackage.eNS_URI);
			if (theStructureMMFactory != null) {
				return theStructureMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StructureMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StructureMMPackage.CLASS: return createClass();
			case StructureMMPackage.DOUBLE_ATTRIBUTE: return createdoubleAttribute();
			case StructureMMPackage.STRING_ATTRIBUTE: return createstringAttribute();
			case StructureMMPackage.CHAR_ATTRIBUTE: return createcharAttribute();
			case StructureMMPackage.BOOL_ATTRIBUTE: return createboolAttribute();
			case StructureMMPackage.INT_ATTRIBUTE: return createintAttribute();
			case StructureMMPackage.INT_METHOD: return createintMethod();
			case StructureMMPackage.BOOL_METHOD: return createboolMethod();
			case StructureMMPackage.CHAR_METHOD: return createcharMethod();
			case StructureMMPackage.STRING_METHOD: return createstringMethod();
			case StructureMMPackage.DOUBLE_METHOD: return createdoubleMethod();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public structureMM.Class createClass() {
		ClassImpl class_ = new ClassImpl();
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public doubleAttribute createdoubleAttribute() {
		doubleAttributeImpl doubleAttribute = new doubleAttributeImpl();
		return doubleAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stringAttribute createstringAttribute() {
		stringAttributeImpl stringAttribute = new stringAttributeImpl();
		return stringAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public charAttribute createcharAttribute() {
		charAttributeImpl charAttribute = new charAttributeImpl();
		return charAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolAttribute createboolAttribute() {
		boolAttributeImpl boolAttribute = new boolAttributeImpl();
		return boolAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public intAttribute createintAttribute() {
		intAttributeImpl intAttribute = new intAttributeImpl();
		return intAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public intMethod createintMethod() {
		intMethodImpl intMethod = new intMethodImpl();
		return intMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolMethod createboolMethod() {
		boolMethodImpl boolMethod = new boolMethodImpl();
		return boolMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public charMethod createcharMethod() {
		charMethodImpl charMethod = new charMethodImpl();
		return charMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public stringMethod createstringMethod() {
		stringMethodImpl stringMethod = new stringMethodImpl();
		return stringMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public doubleMethod createdoubleMethod() {
		doubleMethodImpl doubleMethod = new doubleMethodImpl();
		return doubleMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMMPackage getStructureMMPackage() {
		return (StructureMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StructureMMPackage getPackage() {
		return StructureMMPackage.eINSTANCE;
	}

} //StructureMMFactoryImpl
