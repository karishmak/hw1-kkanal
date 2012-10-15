package cmu.edu.kkanal.hw1.cpe;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.util.Progress;

import cmu.edu.kkanal.hw1.type.SentenceAnnotation;

public class FileCollectionReader extends CollectionReader_ImplBase {

  private boolean finished = false;

  BufferedInputStream fis;

  @Override
  public void getNext(CAS aCAS) throws IOException, CollectionException {
    // TODO Auto-generated method stub
    JCas jcas;
    try {
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new CollectionException(e);
    }
    try {

      FileInputStream fstream = new FileInputStream(
              (String) getConfigParameterValue("input_file_path"));
      DataInputStream in = new DataInputStream(fstream);
      BufferedReader br = new BufferedReader(new InputStreamReader(in));
      String strLine;
      // Read File Line By Line
      while ((strLine = br.readLine()) != null) {

        SentenceAnnotation currentSentence = new SentenceAnnotation(jcas);
        currentSentence.setSentence(strLine);
        currentSentence.addToIndexes(jcas);
      }
      // Close the input stream
      in.close();
    } catch (Exception e) {// Catch exception if any
      System.err.println("Error: " + e.getMessage());
    } finally {

      if (fis != null)
        fis.close();
    }
  }

  @Override
  public void close() throws IOException {
    // TODO Auto-generated method stub

  }

  @Override
  public Progress[] getProgress() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean hasNext() throws IOException, CollectionException {
    // TODO Auto-generated method stub
    if (!finished) {
      finished = true;
      return true;
    }
    return false;
  }

}
