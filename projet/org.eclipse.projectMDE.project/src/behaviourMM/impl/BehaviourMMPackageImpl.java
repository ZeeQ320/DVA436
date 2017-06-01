/**
 */
package behaviourMM.impl;

import behaviourMM.Affectation;
import behaviourMM.BehaviourMMFactory;
import behaviourMM.BehaviourMMPackage;
import behaviourMM.Conditionnal;
import behaviourMM.Loop;
import behaviourMM.Operator;
import behaviourMM.Statement;
import behaviourMM.Variable;
import behaviourMM.additionOperator;
import behaviourMM.andOperator;
import behaviourMM.boolAffectation;
import behaviourMM.boolVariable;
import behaviourMM.charAffectation;
import behaviourMM.charVariable;
import behaviourMM.divisionOperator;
import behaviourMM.doubleAffectation;
import behaviourMM.doubleVariable;
import behaviourMM.elseConditionnal;
import behaviourMM.equalOperator;
import behaviourMM.forLoop;
import behaviourMM.ifConditionnal;
import behaviourMM.inferiorOperator;
import behaviourMM.inferiorOrEqualOperator;
import behaviourMM.intAffectation;
import behaviourMM.intVariable;
import behaviourMM.multiplicationOperator;
import behaviourMM.noOperator;
import behaviourMM.operationAffectation;
import behaviourMM.orOperator;
import behaviourMM.soustractionOperator;
import behaviourMM.stringAffectation;
import behaviourMM.stringVariable;
import behaviourMM.superiorOperator;
import behaviourMM.superiorOrEqualOperator;
import behaviourMM.variableAffectation;
import behaviourMM.writeConsole;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import structureMM.StructureMMPackage;

import structureMM.impl.StructureMMPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviourMMPackageImpl extends EPackageImpl implements BehaviourMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass soustractionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicationOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divisionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inferiorOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superiorOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inferiorOrEqualOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass superiorOrEqualOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionnalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifConditionnalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elseConditionnalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass affectationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationAffectationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableAffectationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intAffectationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleAffectationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boolAffectationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charAffectationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringAffectationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeConsoleEClass = null;

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
	 * @see behaviourMM.BehaviourMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BehaviourMMPackageImpl() {
		super(eNS_URI, BehaviourMMFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BehaviourMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BehaviourMMPackage init() {
		if (isInited) return (BehaviourMMPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviourMMPackage.eNS_URI);

		// Obtain or create and register package
		BehaviourMMPackageImpl theBehaviourMMPackage = (BehaviourMMPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BehaviourMMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BehaviourMMPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		StructureMMPackageImpl theStructureMMPackage = (StructureMMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructureMMPackage.eNS_URI) instanceof StructureMMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructureMMPackage.eNS_URI) : StructureMMPackage.eINSTANCE);

		// Create package meta-data objects
		theBehaviourMMPackage.createPackageContents();
		theStructureMMPackage.createPackageContents();

		// Initialize created meta-data
		theBehaviourMMPackage.initializePackageContents();
		theStructureMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBehaviourMMPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BehaviourMMPackage.eNS_URI, theBehaviourMMPackage);
		return theBehaviourMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoop_Statement() {
		return (EReference)loopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getforLoop() {
		return forLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getforLoop_Iteration() {
		return (EReference)forLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getforLoop_ConditionStop() {
		return (EReference)forLoopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getforLoop_StartValue() {
		return (EReference)forLoopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_Element1() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperator_Element2() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getadditionOperator() {
		return additionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsoustractionOperator() {
		return soustractionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getmultiplicationOperator() {
		return multiplicationOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdivisionOperator() {
		return divisionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getequalOperator() {
		return equalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getinferiorOperator() {
		return inferiorOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsuperiorOperator() {
		return superiorOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getinferiorOrEqualOperator() {
		return inferiorOrEqualOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getsuperiorOrEqualOperator() {
		return superiorOrEqualOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getandOperator() {
		return andOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getorOperator() {
		return orOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getnoOperator() {
		return noOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getintVariable() {
		return intVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getintVariable_Value() {
		return (EAttribute)intVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdoubleVariable() {
		return doubleVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdoubleVariable_Value() {
		return (EAttribute)doubleVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getboolVariable() {
		return boolVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getboolVariable_Value() {
		return (EAttribute)boolVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcharVariable() {
		return charVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcharVariable_Value() {
		return (EAttribute)charVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getstringVariable() {
		return stringVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getstringVariable_Value() {
		return (EAttribute)stringVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionnal() {
		return conditionnalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionnal_Statement() {
		return (EReference)conditionnalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getifConditionnal() {
		return ifConditionnalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getifConditionnal_Condition() {
		return (EReference)ifConditionnalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getifConditionnal_ElseC() {
		return (EReference)ifConditionnalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getelseConditionnal() {
		return elseConditionnalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_Id() {
		return (EAttribute)statementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAffectation() {
		return affectationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAffectation_ReceivingVariable() {
		return (EReference)affectationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getoperationAffectation() {
		return operationAffectationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getoperationAffectation_ReceivedOperation() {
		return (EReference)operationAffectationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getvariableAffectation() {
		return variableAffectationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getvariableAffectation_ReceivedVariable() {
		return (EReference)variableAffectationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getintAffectation() {
		return intAffectationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getintAffectation_ReceivedInt() {
		return (EAttribute)intAffectationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdoubleAffectation() {
		return doubleAffectationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getdoubleAffectation_ReceivedDouble() {
		return (EAttribute)doubleAffectationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getboolAffectation() {
		return boolAffectationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getboolAffectation_ReceivedBool() {
		return (EAttribute)boolAffectationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getcharAffectation() {
		return charAffectationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getcharAffectation_ReceivedChar() {
		return (EAttribute)charAffectationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getstringAffectation() {
		return stringAffectationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getstringAffectation_ReceivedString() {
		return (EAttribute)stringAffectationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getwriteConsole() {
		return writeConsoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwriteConsole_Variable() {
		return (EReference)writeConsoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getwriteConsole_Operation() {
		return (EReference)writeConsoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviourMMFactory getBehaviourMMFactory() {
		return (BehaviourMMFactory)getEFactoryInstance();
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
		loopEClass = createEClass(LOOP);
		createEReference(loopEClass, LOOP__STATEMENT);

		forLoopEClass = createEClass(FOR_LOOP);
		createEReference(forLoopEClass, FOR_LOOP__ITERATION);
		createEReference(forLoopEClass, FOR_LOOP__CONDITION_STOP);
		createEReference(forLoopEClass, FOR_LOOP__START_VALUE);

		operatorEClass = createEClass(OPERATOR);
		createEReference(operatorEClass, OPERATOR__ELEMENT1);
		createEReference(operatorEClass, OPERATOR__ELEMENT2);

		additionOperatorEClass = createEClass(ADDITION_OPERATOR);

		soustractionOperatorEClass = createEClass(SOUSTRACTION_OPERATOR);

		multiplicationOperatorEClass = createEClass(MULTIPLICATION_OPERATOR);

		divisionOperatorEClass = createEClass(DIVISION_OPERATOR);

		equalOperatorEClass = createEClass(EQUAL_OPERATOR);

		inferiorOperatorEClass = createEClass(INFERIOR_OPERATOR);

		superiorOperatorEClass = createEClass(SUPERIOR_OPERATOR);

		inferiorOrEqualOperatorEClass = createEClass(INFERIOR_OR_EQUAL_OPERATOR);

		superiorOrEqualOperatorEClass = createEClass(SUPERIOR_OR_EQUAL_OPERATOR);

		andOperatorEClass = createEClass(AND_OPERATOR);

		orOperatorEClass = createEClass(OR_OPERATOR);

		noOperatorEClass = createEClass(NO_OPERATOR);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);

		intVariableEClass = createEClass(INT_VARIABLE);
		createEAttribute(intVariableEClass, INT_VARIABLE__VALUE);

		doubleVariableEClass = createEClass(DOUBLE_VARIABLE);
		createEAttribute(doubleVariableEClass, DOUBLE_VARIABLE__VALUE);

		boolVariableEClass = createEClass(BOOL_VARIABLE);
		createEAttribute(boolVariableEClass, BOOL_VARIABLE__VALUE);

		charVariableEClass = createEClass(CHAR_VARIABLE);
		createEAttribute(charVariableEClass, CHAR_VARIABLE__VALUE);

		stringVariableEClass = createEClass(STRING_VARIABLE);
		createEAttribute(stringVariableEClass, STRING_VARIABLE__VALUE);

		conditionnalEClass = createEClass(CONDITIONNAL);
		createEReference(conditionnalEClass, CONDITIONNAL__STATEMENT);

		ifConditionnalEClass = createEClass(IF_CONDITIONNAL);
		createEReference(ifConditionnalEClass, IF_CONDITIONNAL__CONDITION);
		createEReference(ifConditionnalEClass, IF_CONDITIONNAL__ELSE_C);

		elseConditionnalEClass = createEClass(ELSE_CONDITIONNAL);

		statementEClass = createEClass(STATEMENT);
		createEAttribute(statementEClass, STATEMENT__ID);

		affectationEClass = createEClass(AFFECTATION);
		createEReference(affectationEClass, AFFECTATION__RECEIVING_VARIABLE);

		operationAffectationEClass = createEClass(OPERATION_AFFECTATION);
		createEReference(operationAffectationEClass, OPERATION_AFFECTATION__RECEIVED_OPERATION);

		variableAffectationEClass = createEClass(VARIABLE_AFFECTATION);
		createEReference(variableAffectationEClass, VARIABLE_AFFECTATION__RECEIVED_VARIABLE);

		intAffectationEClass = createEClass(INT_AFFECTATION);
		createEAttribute(intAffectationEClass, INT_AFFECTATION__RECEIVED_INT);

		doubleAffectationEClass = createEClass(DOUBLE_AFFECTATION);
		createEAttribute(doubleAffectationEClass, DOUBLE_AFFECTATION__RECEIVED_DOUBLE);

		boolAffectationEClass = createEClass(BOOL_AFFECTATION);
		createEAttribute(boolAffectationEClass, BOOL_AFFECTATION__RECEIVED_BOOL);

		charAffectationEClass = createEClass(CHAR_AFFECTATION);
		createEAttribute(charAffectationEClass, CHAR_AFFECTATION__RECEIVED_CHAR);

		stringAffectationEClass = createEClass(STRING_AFFECTATION);
		createEAttribute(stringAffectationEClass, STRING_AFFECTATION__RECEIVED_STRING);

		writeConsoleEClass = createEClass(WRITE_CONSOLE);
		createEReference(writeConsoleEClass, WRITE_CONSOLE__VARIABLE);
		createEReference(writeConsoleEClass, WRITE_CONSOLE__OPERATION);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		loopEClass.getESuperTypes().add(this.getStatement());
		forLoopEClass.getESuperTypes().add(this.getLoop());
		additionOperatorEClass.getESuperTypes().add(this.getOperator());
		soustractionOperatorEClass.getESuperTypes().add(this.getOperator());
		multiplicationOperatorEClass.getESuperTypes().add(this.getOperator());
		divisionOperatorEClass.getESuperTypes().add(this.getOperator());
		equalOperatorEClass.getESuperTypes().add(this.getOperator());
		inferiorOperatorEClass.getESuperTypes().add(this.getOperator());
		superiorOperatorEClass.getESuperTypes().add(this.getOperator());
		inferiorOrEqualOperatorEClass.getESuperTypes().add(this.getOperator());
		superiorOrEqualOperatorEClass.getESuperTypes().add(this.getOperator());
		andOperatorEClass.getESuperTypes().add(this.getOperator());
		orOperatorEClass.getESuperTypes().add(this.getOperator());
		noOperatorEClass.getESuperTypes().add(this.getOperator());
		variableEClass.getESuperTypes().add(this.getStatement());
		intVariableEClass.getESuperTypes().add(this.getVariable());
		doubleVariableEClass.getESuperTypes().add(this.getVariable());
		boolVariableEClass.getESuperTypes().add(this.getVariable());
		charVariableEClass.getESuperTypes().add(this.getVariable());
		stringVariableEClass.getESuperTypes().add(this.getVariable());
		conditionnalEClass.getESuperTypes().add(this.getStatement());
		ifConditionnalEClass.getESuperTypes().add(this.getConditionnal());
		elseConditionnalEClass.getESuperTypes().add(this.getConditionnal());
		affectationEClass.getESuperTypes().add(this.getStatement());
		operationAffectationEClass.getESuperTypes().add(this.getAffectation());
		variableAffectationEClass.getESuperTypes().add(this.getAffectation());
		intAffectationEClass.getESuperTypes().add(this.getAffectation());
		doubleAffectationEClass.getESuperTypes().add(this.getAffectation());
		boolAffectationEClass.getESuperTypes().add(this.getAffectation());
		charAffectationEClass.getESuperTypes().add(this.getAffectation());
		stringAffectationEClass.getESuperTypes().add(this.getAffectation());
		writeConsoleEClass.getESuperTypes().add(this.getStatement());

		// Initialize classes, features, and operations; add parameters
		initEClass(loopEClass, Loop.class, "Loop", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoop_Statement(), this.getStatement(), null, "statement", null, 1, -1, Loop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forLoopEClass, forLoop.class, "forLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getforLoop_Iteration(), this.getOperator(), null, "iteration", null, 1, 1, forLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getforLoop_ConditionStop(), this.getOperator(), null, "conditionStop", null, 1, 1, forLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getforLoop_StartValue(), this.getAffectation(), null, "startValue", null, 1, 1, forLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperator_Element1(), this.getVariable(), null, "element1", null, 1, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperator_Element2(), this.getVariable(), null, "element2", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additionOperatorEClass, additionOperator.class, "additionOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(soustractionOperatorEClass, soustractionOperator.class, "soustractionOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplicationOperatorEClass, multiplicationOperator.class, "multiplicationOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(divisionOperatorEClass, divisionOperator.class, "divisionOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalOperatorEClass, equalOperator.class, "equalOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inferiorOperatorEClass, inferiorOperator.class, "inferiorOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(superiorOperatorEClass, superiorOperator.class, "superiorOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inferiorOrEqualOperatorEClass, inferiorOrEqualOperator.class, "inferiorOrEqualOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(superiorOrEqualOperatorEClass, superiorOrEqualOperator.class, "superiorOrEqualOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(andOperatorEClass, andOperator.class, "andOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orOperatorEClass, orOperator.class, "orOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noOperatorEClass, noOperator.class, "noOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intVariableEClass, intVariable.class, "intVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getintVariable_Value(), ecorePackage.getEInt(), "value", null, 0, 1, intVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleVariableEClass, doubleVariable.class, "doubleVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getdoubleVariable_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, doubleVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boolVariableEClass, boolVariable.class, "boolVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getboolVariable_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, boolVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(charVariableEClass, charVariable.class, "charVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getcharVariable_Value(), ecorePackage.getEChar(), "value", null, 0, 1, charVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringVariableEClass, stringVariable.class, "stringVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getstringVariable_Value(), ecorePackage.getEString(), "value", null, 0, 1, stringVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionnalEClass, Conditionnal.class, "Conditionnal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionnal_Statement(), this.getStatement(), null, "statement", null, 1, -1, Conditionnal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifConditionnalEClass, ifConditionnal.class, "ifConditionnal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getifConditionnal_Condition(), this.getOperator(), null, "condition", null, 1, 1, ifConditionnal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getifConditionnal_ElseC(), this.getelseConditionnal(), null, "elseC", null, 0, 1, ifConditionnal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elseConditionnalEClass, elseConditionnal.class, "elseConditionnal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatement_Id(), ecorePackage.getEInt(), "id", null, 1, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(affectationEClass, Affectation.class, "Affectation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAffectation_ReceivingVariable(), this.getVariable(), null, "receivingVariable", null, 1, 1, Affectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationAffectationEClass, operationAffectation.class, "operationAffectation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getoperationAffectation_ReceivedOperation(), this.getOperator(), null, "receivedOperation", null, 1, 1, operationAffectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableAffectationEClass, variableAffectation.class, "variableAffectation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getvariableAffectation_ReceivedVariable(), this.getVariable(), null, "receivedVariable", null, 1, 1, variableAffectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intAffectationEClass, intAffectation.class, "intAffectation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getintAffectation_ReceivedInt(), ecorePackage.getEInt(), "receivedInt", null, 1, 1, intAffectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleAffectationEClass, doubleAffectation.class, "doubleAffectation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getdoubleAffectation_ReceivedDouble(), ecorePackage.getEDouble(), "receivedDouble", null, 1, 1, doubleAffectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boolAffectationEClass, boolAffectation.class, "boolAffectation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getboolAffectation_ReceivedBool(), ecorePackage.getEBoolean(), "receivedBool", null, 1, 1, boolAffectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(charAffectationEClass, charAffectation.class, "charAffectation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getcharAffectation_ReceivedChar(), ecorePackage.getEChar(), "receivedChar", null, 1, 1, charAffectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringAffectationEClass, stringAffectation.class, "stringAffectation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getstringAffectation_ReceivedString(), ecorePackage.getEString(), "receivedString", null, 1, 1, stringAffectation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(writeConsoleEClass, writeConsole.class, "writeConsole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getwriteConsole_Variable(), this.getVariable(), null, "variable", null, 0, -1, writeConsole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getwriteConsole_Operation(), this.getOperator(), null, "operation", null, 0, -1, writeConsole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BehaviourMMPackageImpl
