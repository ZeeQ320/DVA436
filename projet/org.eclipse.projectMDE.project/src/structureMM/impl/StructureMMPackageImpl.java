/**
 */
package structureMM.impl;

import behaviourMM.BehaviourMMPackage;

import behaviourMM.impl.BehaviourMMPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import structureMM.Attribute;
import structureMM.Method;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructureMMPackageImpl extends EPackageImpl implements StructureMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleMethodEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see structureMM.StructureMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StructureMMPackageImpl() {
		super(eNS_URI, StructureMMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StructureMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StructureMMPackage init() {
		if (isInited) return (StructureMMPackage)EPackage.Registry.INSTANCE.getEPackage(StructureMMPackage.eNS_URI);

		// Obtain or create and register package
		StructureMMPackageImpl theStructureMMPackage = (StructureMMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StructureMMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StructureMMPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BehaviourMMPackageImpl theBehaviourMMPackage = (BehaviourMMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviourMMPackage.eNS_URI) instanceof BehaviourMMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviourMMPackage.eNS_URI) : BehaviourMMPackage.eINSTANCE);

		// Create package meta-data objects
		theStructureMMPackage.createPackageContents();
		theBehaviourMMPackage.createPackageContents();

		// Initialize created meta-data
		theStructureMMPackage.initializePackageContents();
		theBehaviourMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStructureMMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StructureMMPackage.eNS_URI, theStructureMMPackage);
		return theStructureMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_Name() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Methods() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Attributes() {
		return (EReference)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdoubleAttribute() {
		return doubleAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdoubleAttribute_Value() {
		return (EAttribute)doubleAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getstringAttribute() {
		return stringAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getstringAttribute_Value() {
		return (EAttribute)stringAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcharAttribute() {
		return charAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcharAttribute_Value() {
		return (EAttribute)charAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getboolAttribute() {
		return boolAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getboolAttribute_Value() {
		return (EAttribute)boolAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getintAttribute() {
		return intAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getintAttribute_Value() {
		return (EAttribute)intAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethod_Name() {
		return (EAttribute)methodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Inputs() {
		return (EReference)methodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethod_Statement() {
		return (EReference)methodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getintMethod() {
		return intMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getintMethod_ReturnType() {
		return (EAttribute)intMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getboolMethod() {
		return boolMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getboolMethod_ReturnType() {
		return (EAttribute)boolMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcharMethod() {
		return charMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcharMethod_ReturnType() {
		return (EAttribute)charMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getstringMethod() {
		return stringMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getstringMethod_ReturnType() {
		return (EAttribute)stringMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdoubleMethod() {
		return doubleMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdoubleMethod_ReturnType() {
		return (EAttribute)doubleMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructureMMFactory getStructureMMFactory() {
		return (StructureMMFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		classEClass = createEClass(CLASS);
		createEAttribute(classEClass, CLASS__NAME);
		createEReference(classEClass, CLASS__METHODS);
		createEReference(classEClass, CLASS__ATTRIBUTES);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);

		doubleAttributeEClass = createEClass(DOUBLE_ATTRIBUTE);
		createEAttribute(doubleAttributeEClass, DOUBLE_ATTRIBUTE__VALUE);

		stringAttributeEClass = createEClass(STRING_ATTRIBUTE);
		createEAttribute(stringAttributeEClass, STRING_ATTRIBUTE__VALUE);

		charAttributeEClass = createEClass(CHAR_ATTRIBUTE);
		createEAttribute(charAttributeEClass, CHAR_ATTRIBUTE__VALUE);

		boolAttributeEClass = createEClass(BOOL_ATTRIBUTE);
		createEAttribute(boolAttributeEClass, BOOL_ATTRIBUTE__VALUE);

		intAttributeEClass = createEClass(INT_ATTRIBUTE);
		createEAttribute(intAttributeEClass, INT_ATTRIBUTE__VALUE);

		methodEClass = createEClass(METHOD);
		createEAttribute(methodEClass, METHOD__NAME);
		createEReference(methodEClass, METHOD__INPUTS);
		createEReference(methodEClass, METHOD__STATEMENT);

		intMethodEClass = createEClass(INT_METHOD);
		createEAttribute(intMethodEClass, INT_METHOD__RETURN_TYPE);

		boolMethodEClass = createEClass(BOOL_METHOD);
		createEAttribute(boolMethodEClass, BOOL_METHOD__RETURN_TYPE);

		charMethodEClass = createEClass(CHAR_METHOD);
		createEAttribute(charMethodEClass, CHAR_METHOD__RETURN_TYPE);

		stringMethodEClass = createEClass(STRING_METHOD);
		createEAttribute(stringMethodEClass, STRING_METHOD__RETURN_TYPE);

		doubleMethodEClass = createEClass(DOUBLE_METHOD);
		createEAttribute(doubleMethodEClass, DOUBLE_METHOD__RETURN_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BehaviourMMPackage theBehaviourMMPackage = (BehaviourMMPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviourMMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		doubleAttributeEClass.getESuperTypes().add(this.getAttribute());
		stringAttributeEClass.getESuperTypes().add(this.getAttribute());
		charAttributeEClass.getESuperTypes().add(this.getAttribute());
		boolAttributeEClass.getESuperTypes().add(this.getAttribute());
		intAttributeEClass.getESuperTypes().add(this.getAttribute());
		intMethodEClass.getESuperTypes().add(this.getMethod());
		boolMethodEClass.getESuperTypes().add(this.getMethod());
		charMethodEClass.getESuperTypes().add(this.getMethod());
		stringMethodEClass.getESuperTypes().add(this.getMethod());
		doubleMethodEClass.getESuperTypes().add(this.getMethod());

		// Initialize classes, features, and operations; add parameters
		initEClass(classEClass, structureMM.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, structureMM.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Methods(), this.getMethod(), null, "methods", null, 0, -1, structureMM.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, structureMM.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleAttributeEClass, doubleAttribute.class, "doubleAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getdoubleAttribute_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, doubleAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringAttributeEClass, stringAttribute.class, "stringAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getstringAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, stringAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(charAttributeEClass, charAttribute.class, "charAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getcharAttribute_Value(), ecorePackage.getEChar(), "value", "\'\'", 0, 1, charAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boolAttributeEClass, boolAttribute.class, "boolAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getboolAttribute_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, boolAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intAttributeEClass, intAttribute.class, "intAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getintAttribute_Value(), ecorePackage.getEInt(), "value", null, 0, 1, intAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodEClass, Method.class, "Method", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Inputs(), this.getAttribute(), null, "inputs", null, 0, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethod_Statement(), theBehaviourMMPackage.getStatement(), null, "statement", null, 1, -1, Method.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intMethodEClass, intMethod.class, "intMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getintMethod_ReturnType(), ecorePackage.getEInt(), "returnType", null, 0, 1, intMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boolMethodEClass, boolMethod.class, "boolMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getboolMethod_ReturnType(), ecorePackage.getEBoolean(), "returnType", null, 0, 1, boolMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(charMethodEClass, charMethod.class, "charMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getcharMethod_ReturnType(), ecorePackage.getEChar(), "returnType", null, 0, 1, charMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringMethodEClass, stringMethod.class, "stringMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getstringMethod_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, stringMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleMethodEClass, doubleMethod.class, "doubleMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getdoubleMethod_ReturnType(), ecorePackage.getEDouble(), "returnType", null, 0, 1, doubleMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //StructureMMPackageImpl
