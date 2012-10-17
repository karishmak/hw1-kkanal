

/* First created by JCasGen Sat Oct 13 14:28:26 EDT 2012 */
package cmu.edu.kkanal.hw1.type;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Oct 16 12:31:56 EDT 2012
 * XML source: E:/Lectures/Software Engineering/Workspace/hw1-kkanal/src/main/resources/analysisEngineDescriptor.xml
 * @generated */
public class GeneAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(GeneAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected GeneAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public GeneAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public GeneAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public GeneAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Sentence_ID

  /** getter for Sentence_ID - gets stores Sentence ID
   * @generated */
  public String getSentence_ID() {
    if (GeneAnnotation_Type.featOkTst && ((GeneAnnotation_Type)jcasType).casFeat_Sentence_ID == null)
      jcasType.jcas.throwFeatMissing("Sentence_ID", "cmu.edu.kkanal.hw1.type.GeneAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneAnnotation_Type)jcasType).casFeatCode_Sentence_ID);}
    
  /** setter for Sentence_ID - sets stores Sentence ID 
   * @generated */
  public void setSentence_ID(String v) {
    if (GeneAnnotation_Type.featOkTst && ((GeneAnnotation_Type)jcasType).casFeat_Sentence_ID == null)
      jcasType.jcas.throwFeatMissing("Sentence_ID", "cmu.edu.kkanal.hw1.type.GeneAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneAnnotation_Type)jcasType).casFeatCode_Sentence_ID, v);}    
   
    
  //*--------------*
  //* Feature: GeneName

  /** getter for GeneName - gets name of gene found
   * @generated */
  public String getGeneName() {
    if (GeneAnnotation_Type.featOkTst && ((GeneAnnotation_Type)jcasType).casFeat_GeneName == null)
      jcasType.jcas.throwFeatMissing("GeneName", "cmu.edu.kkanal.hw1.type.GeneAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((GeneAnnotation_Type)jcasType).casFeatCode_GeneName);}
    
  /** setter for GeneName - sets name of gene found 
   * @generated */
  public void setGeneName(String v) {
    if (GeneAnnotation_Type.featOkTst && ((GeneAnnotation_Type)jcasType).casFeat_GeneName == null)
      jcasType.jcas.throwFeatMissing("GeneName", "cmu.edu.kkanal.hw1.type.GeneAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((GeneAnnotation_Type)jcasType).casFeatCode_GeneName, v);}    
   
    
  //*--------------*
  //* Feature: Start_Index

  /** getter for Start_Index - gets 
   * @generated */
  public int getStart_Index() {
    if (GeneAnnotation_Type.featOkTst && ((GeneAnnotation_Type)jcasType).casFeat_Start_Index == null)
      jcasType.jcas.throwFeatMissing("Start_Index", "cmu.edu.kkanal.hw1.type.GeneAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((GeneAnnotation_Type)jcasType).casFeatCode_Start_Index);}
    
  /** setter for Start_Index - sets  
   * @generated */
  public void setStart_Index(int v) {
    if (GeneAnnotation_Type.featOkTst && ((GeneAnnotation_Type)jcasType).casFeat_Start_Index == null)
      jcasType.jcas.throwFeatMissing("Start_Index", "cmu.edu.kkanal.hw1.type.GeneAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((GeneAnnotation_Type)jcasType).casFeatCode_Start_Index, v);}    
   
    
  //*--------------*
  //* Feature: End_Index

  /** getter for End_Index - gets 
   * @generated */
  public int getEnd_Index() {
    if (GeneAnnotation_Type.featOkTst && ((GeneAnnotation_Type)jcasType).casFeat_End_Index == null)
      jcasType.jcas.throwFeatMissing("End_Index", "cmu.edu.kkanal.hw1.type.GeneAnnotation");
    return jcasType.ll_cas.ll_getIntValue(addr, ((GeneAnnotation_Type)jcasType).casFeatCode_End_Index);}
    
  /** setter for End_Index - sets  
   * @generated */
  public void setEnd_Index(int v) {
    if (GeneAnnotation_Type.featOkTst && ((GeneAnnotation_Type)jcasType).casFeat_End_Index == null)
      jcasType.jcas.throwFeatMissing("End_Index", "cmu.edu.kkanal.hw1.type.GeneAnnotation");
    jcasType.ll_cas.ll_setIntValue(addr, ((GeneAnnotation_Type)jcasType).casFeatCode_End_Index, v);}    
  }

    