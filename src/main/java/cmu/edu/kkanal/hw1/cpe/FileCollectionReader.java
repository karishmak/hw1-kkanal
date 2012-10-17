package cmu.edu.kkanal.hw1.cpe;

/**
 * @author karishma kanal
 * Class to read collection
 */
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

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

  /**
   * Gets the next element of the Collection
   * @param aCas - The cas to populate
   * @throws  UIMA_IllegalStateException - if there are no more elements left in the collection
              IOException - if an I/O failure occurs
              CollectionException - if there is some other problem with reading from the Collection

   */
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
      // Close the input streamO
      in.close();
    } catch (Exception e) {// Catch exception if any
      System.err.println("Error: " + e.getMessage());
    } finally {

      if (fis != null)
        fis.close();
    }
  }

  /**
   * Closes this CollectionReader, after which it may no longer be used.
   * 
   * @throws IOException
   *           if IO error occurs
   */
  @Override
  public void close() throws IOException {
    // TODO Auto-generated method stub

  }

  /**
   * Gets information about the number of entities and/or amount of data that has been read from
   * this CollectionReader, and the total amount that remains (if that information is available).
   * @return an array of Progress objects. Each object may have different units (for example number of entities or bytes)
   */
  @Override
  public Progress[] getProgress() {
    // TODO Auto-generated method stub
    return null;
  }

  /**
   * Gets whether there are any elements remaining to be read from this CollectionReader.
   * 
   * @return true if and only if there are more elements availble from this CollectionReader.
   * @throws IOException
   *           if IO error occurs, CollectionException if there is any other problem
   */
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
