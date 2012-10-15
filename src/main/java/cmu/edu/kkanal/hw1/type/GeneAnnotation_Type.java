
/* First created by JCasGen Sat Oct 13 14:28:26 EDT 2012 */
package cmu.edu.kkanal.hw1.type;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Sat Oct 13 20:37:23 EDT 2012
 * @generated */
public class GeneAnnotation_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (GeneAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = GeneAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new GeneAnnotation(addr, GeneAnnotation_Type.this);
  			   GeneAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new GeneAnnotation(addr, GeneAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = GeneAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("cmu.edu.kkanal.hw1.type.GeneAnnotation");
 
  /** @generated */
  final Feature casFeat_Sentence_ID;
  /** @generated */
  final int     casFeatCode_Sentence_ID;
  /** @generated */ 
  public String getSentence_ID(int addr) {
        if (featOkTst && casFeat_Sentence_ID == null)
      jcas.throwFeatMissing("Sentence_ID", "cmu.edu.kkanal.hw1.type.GeneAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Sentence_ID);
  }
  /** @generated */    
  public void setSentence_ID(int addr, String v) {
        if (featOkTst && casFeat_Sentence_ID == null)
      jcas.throwFeatMissing("Sentence_ID", "cmu.edu.kkanal.hw1.type.GeneAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_Sentence_ID, v);}
    
  
 
  /** @generated */
  final Feature casFeat_GeneName;
  /** @generated */
  final int     casFeatCode_GeneName;
  /** @generated */ 
  public String getGeneName(int addr) {
        if (featOkTst && casFeat_GeneName == null)
      jcas.throwFeatMissing("GeneName", "cmu.edu.kkanal.hw1.type.GeneAnnotation");
    return ll_cas.ll_getStringValue(addr, casFeatCode_GeneName);
  }
  /** @generated */    
  public void setGeneName(int addr, String v) {
        if (featOkTst && casFeat_GeneName == null)
      jcas.throwFeatMissing("GeneName", "cmu.edu.kkanal.hw1.type.GeneAnnotation");
    ll_cas.ll_setStringValue(addr, casFeatCode_GeneName, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Start_Index;
  /** @generated */
  final int     casFeatCode_Start_Index;
  /** @generated */ 
  public int getStart_Index(int addr) {
        if (featOkTst && casFeat_Start_Index == null)
      jcas.throwFeatMissing("Start_Index", "cmu.edu.kkanal.hw1.type.GeneAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Start_Index);
  }
  /** @generated */    
  public void setStart_Index(int addr, int v) {
        if (featOkTst && casFeat_Start_Index == null)
      jcas.throwFeatMissing("Start_Index", "cmu.edu.kkanal.hw1.type.GeneAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_Start_Index, v);}
    
  
 
  /** @generated */
  final Feature casFeat_End_Index;
  /** @generated */
  final int     casFeatCode_End_Index;
  /** @generated */ 
  public int getEnd_Index(int addr) {
        if (featOkTst && casFeat_End_Index == null)
      jcas.throwFeatMissing("End_Index", "cmu.edu.kkanal.hw1.type.GeneAnnotation");
    return ll_cas.ll_getIntValue(addr, casFeatCode_End_Index);
  }
  /** @generated */    
  public void setEnd_Index(int addr, int v) {
        if (featOkTst && casFeat_End_Index == null)
      jcas.throwFeatMissing("End_Index", "cmu.edu.kkanal.hw1.type.GeneAnnotation");
    ll_cas.ll_setIntValue(addr, casFeatCode_End_Index, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public GeneAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Sentence_ID = jcas.getRequiredFeatureDE(casType, "Sentence_ID", "uima.cas.String", featOkTst);
    casFeatCode_Sentence_ID  = (null == casFeat_Sentence_ID) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Sentence_ID).getCode();

 
    casFeat_GeneName = jcas.getRequiredFeatureDE(casType, "GeneName", "uima.cas.String", featOkTst);
    casFeatCode_GeneName  = (null == casFeat_GeneName) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_GeneName).getCode();

 
    casFeat_Start_Index = jcas.getRequiredFeatureDE(casType, "Start_Index", "uima.cas.Integer", featOkTst);
    casFeatCode_Start_Index  = (null == casFeat_Start_Index) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Start_Index).getCode();

 
    casFeat_End_Index = jcas.getRequiredFeatureDE(casType, "End_Index", "uima.cas.Integer", featOkTst);
    casFeatCode_End_Index  = (null == casFeat_End_Index) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_End_Index).getCode();

  }
}



    