package utility;

import java.io.*;
import java.net.*;
import java.util.*;
import org.apache.commons.math.distribution.*;

public class Utility {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{

//		String inputFileName = "split_user_allmessage_response_all_old.txt";
//		String outputFileName = "split_user_allmessage_response_all.txt";
//		Utility.removeFileLine(inputFileName, outputFileName, 21849, "UTF-8");
//		String inputFileName = "split_user_allmessage_response_valid_all_old.txt";
//		String outputFileName = "split_user_allmessage_response_valid_all.txt";
//		Utility.removeFileLine(inputFileName, outputFileName, 21022, "UTF-8");
		
//		int a = Utility.getFileLineNumber("c/1.txt");
//		int b = Utility.getFileLineNumber("c/2.txt");
//		System.out.println(a + " + " + b + " = " + (a+b));
//		Utility.combineFilesWithHeader("c");
//		System.out.println(Utility.getFileLineNumber("c.txt"));
			
//		double[] data = Utility.loadDoubleArray("test.txt");
//		double ci = Utility.computeConfidenceInterval(data, 0.95);
//		System.out.println(ci);
		
		//double[] data = {1,1,1,1,1,1,1,2,3,3,4,5,5,7,8,9,9,9,11,12,12,12,12,16,17,18,18,18,19,22,33,35,37,40,53,59,64,65,66,83,85,89,99,112,122,131,138,139,152,160,161,178,181,182,188,208,218,223,225,227,233,234,240,266,273,279,305,306,307,348,372,377,395,396,405,405,416,457,577,603,610,696,703};
//		double[] data = {7,2,25,2,2,2,46,2,2,20,2,3,2,2,1,2,2,2,1,1,2,2,2,2};
//		System.out.println(Utility.computeRankBasedAUC(data, 230));
		
//		int[][] i = Utility.loadInteger2DArray("test.csv");
//		Utility.printInteger2DArray(i, i.length, i[0].length);
		
//		Vector<Integer> a = new Vector<Integer>();
//		a.add(1);
//		a.add(2);
//		a.add(3);
//		Vector<Integer> b = new Vector<Integer>();
//		b.add(4);
//		b.add(5);
//		b.add(6);
//		Vector<Vector<Integer>> ab = new Vector<Vector<Integer>>();
//		ab.add(a);
//		ab.add(b);
//		int[][] i = Utility.integer2DVectorToInteger2DArray(ab);
//		Utility.printInteger2DArray(i, i.length, i[0].length);
		
//		int[][] a = {{1, 2, 3},
//				     {4, 5, 6},
//				     {7, 8, 9}};
//		Utility.saveInteger2DArray("test.csv", a);
		
//		double[] b = Utility.loadDoubleArray("AI_section4_rescale.label");
//		System.out.println(Utility.computeMean(b));
		
//		System.out.println(Utility.getLibLinearProbabilities("AI_section4_rescale_liblinear.output", "AI_section4_rescale_liblinear.result", "labels 1 -1"));
//		System.out.println(Utility.getLibLinearProbabilities("AI_section4_liblinear.output", "AI_section4_liblinear.result", "labels 1 -1"));

//		double[] a = Utility.loadDoubleArray("a.result");
//		double[] b = Utility.loadDoubleArray("a.label");
//		System.out.println(Utility.computeRMSE(a, b));

		//double[] a = Utility.loadDoubleArray("AI_section4_rescale_liblinear.result");
		//double[] a = Utility.loadDoubleArray("AI_section4_rescale_0_1.0.result");
		//double[] a = Utility.loadDoubleArray("AI_section4_rescale_3_1.0.result");
//		double[] a = Utility.loadDoubleArray("AI_section4_liblinear.result");
//		double[] b = Utility.loadDoubleArray("AI_section4_rescale.label");
//		for(int i=0; i<b.length; i++) {
//			if(b[i] < 0) {
//				b[i] = 0;
//			}
//		}
//		System.out.println(Utility.computeRMSE(a, b));
		
//		Utility.getLibLinearLabels("AI_section4_rescale_test.lib", "AI_section4_rescale.label");
		

//		Utility.extractFile("DBLP-citation-Feb21.txt", 10000);

//		String address = "http://mops.twse.com.tw/server-java/t108sb19?step=1&colorchg=1&TYPEK=sii&isnew=false&co_id=1101&YEAR=95&MONTH=all&SDAY=1&EDAY=31&";
//		String html = Utility.getHtmlOnce(address, "", "", false);
//		System.out.println(html);
		
//		Date sd = new Date(1272992081647l);
//		Date se = new Date(1272892081647l);
//		System.out.println(sd);
//		System.out.println(se);
//		System.out.println(computeDifferenceIn24Hours(sd, se));
//		System.out.println(computeDifferenceInDays(sd, se));
		
//		Utility.downloadFile("http://www.twse.com.tw/ch/trading/exchange/MI_INDEX/MI_INDEX_print.php?genpage=genpage/Report200901/A11220090101MS.php&type=csv", "1.csv");

//		long[] data = {66920, 56130, 60983, 59438, 62517, 59709, 59015, 57832, 56769, 57062, 53298, 57151};
//		printLongArray(data, data.length);
//		double[] n = getNormalizedArray(data);
//		printDoubleArray(n, n.length);
		
		/*
		int[] data = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] shuffledData = shuffleIntegerArray(data);
		printIntegerArray(shuffledData, shuffledData.length);
		*/
		
		//double a = 0;
		//double b = 0;
		//boolean c = (a==b);
		//System.out.println(c);
		
		//double[] x = {Double.NaN, 3, 5, Double.NaN, 7}; 
		//double[] y = {Double.NaN, 2, 3, Double.NaN, 5}; 
		//System.out.println(computeSquareMeanDifference(x, y));
		
		//String[] unique = {"a", "c", "d", "c"};
		//String[] add = {"e", "c", "e", "b"};
		//String[] newUnique = Utility.uniqueStringArray(unique);
		//Utility.printStringArray(newUnique, newUnique.length);
			
		//double[] data = {0.0, 0.0, 0.0, 0.0, 0.0};
		//double[] data = {4.0, 4.0, 4.0, 4.0, 4.0};
		//double[] data = {0.0, 3.0, 2.0, 0.0, 4.0};
		//double[] data = {0.0, 1.0, 2.0, 3.0, 4.0};
		//System.out.println("AUC = " + Utility.computeRankAUC(data));
		
		//double[] data = {0.1, 0.1, 0.6, 0.3, 0.9, 0.7, 0.1, 0.1};
		
		//data = Utility.getNormalizedScoreArray(data);
		//Utility.printDoubleArray(data, 8);
		
		//Utility.printDoubleArray(data, 2);
		
		//double[] data = {5.0000,3.0000,4.0000};
		double[] data = {4,1,1,1,1,1,1,2,2,2,3,3,4,4,2,3};
//		int[] ground = {1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0};
		
		double[] rank = scoreArrayToRankArrayRandomAscending(data);
		Utility.printDoubleArray(rank, rank.length);
//		int[] binary = scoreArrayToBinaryArrayAscending(data);
//		Utility.printIntegerArray(binary, binary.length);
//		Utility.printIntegerArray(ground, ground.length);
//		System.out.println(computeAccuracy(binary, ground));
		
		//System.out.println("!!" + getSortedArrayRank(0.1, data));
		
		/*
		int index = 1;
		System.out.println(getActualRankingDescending(data, index));
		*/
		
		/*
		double[] data = {0.124353, 0.653214, 0.5742653, 0.464352};System.out.println(computeMean(data));
		System.out.println(computeAccurateMean(data));
		System.out.println(computeStandardDeviation(data));
		System.out.println(computeAccurateStandardDeviation(data));
		*/
		
		//TreeMap<Integer, Double> tm = new TreeMap<Integer, Double>();
		//tm.put(1, 0.3);
		//tm.put(2, 0.7);
		//tm.put(3, 0.2);
		//tm.put(4, 0.5);
		//int[] keys = Utility.getTopValuedKeys(tm, 2, true);
		//Utility.printIntegerArray(keys, keys.length);
		//TreeMap<Integer, Double> result = Utility.getTopValuedIntegerToDoubleTreeMap(tm, 2, false);
		//Utility.printIntegerToDoubleTreeMap(result, result.size());
		
//		TreeSet<String> ts = Utility.listFileInAlphabeticalOrder("src/");
//		Utility.printStringTreeSet(ts);
		
		//double[] data = {0.1, 0.1, 0.6, 0.3, 0.9, 0.7, 0.1, 0.1};
		//data = Utility.uniqueDoubleArray(data);
		//Utility.printDoubleArray(data, data.length);
		
//		Random random = new Random();
//		TreeMap<Long, Double> idPrior = new TreeMap<Long, Double>();
//		idPrior.put((long)0, 505.0);
//		idPrior.put((long)1, 305.0);
//		idPrior.put((long)2, 105.0);
//		int[] array = new int[3];
//		for(int i=0; i<915; i++) {
//			array[(int)randomSelectionWithPrior(idPrior, random)]++;
//		}
//		Utility.printIntegerArray(array, array.length);

//		Random random = new Random();
//		TreeMap<Long, Double> idPrior = new TreeMap<Long, Double>();
//		System.out.println(randomSelectionWithPrior(idPrior, random));
		
//		String s = Utility.loadString("test.txt");
//		String sub = "href";
//		System.out.println(computeSubstring(s, sub));
		
		//Utility.combineFiles("message", "UTF-8");
		
//		Vector<Integer> v = Utility.getShuffledVector(5);
//		Vector<Integer> sv = Utility.shuffleIntegerVector(v);
//		Utility.printIntegerArray(Utility.integerVectorToIntegerArray(v), v.size());
//		Utility.printIntegerArray(Utility.integerVectorToIntegerArray(sv), sv.size());
		
//		double[] data = {1};
//		double[] li = Utility.linearInterpolation(data, 29);
//		Utility.printDoubleArray(li, li.length);
		
//		double[][] a = {{2, 3, -1},
//				        {1, -2, 2},
//				        {-1, 4, 3}};
//		double[][] b = {{1, -2},
//				        {2, 2},
//				        {4, -1}};
//		double[][] c = Utility.matrixMultiplication(a, b);
//		Utility.printDouble2DArray(c, c.length, c[0].length);
//		double[][] d = Utility.getNormalized2DArray(c);
//		Utility.printDouble2DArray(d, d.length, d[0].length);
		
		//double[] a = {0.7916684587723383,0.9136396256453554,0.30037833775913747,0.6564837760573311,0.5751815570082597,0.7975715970385918,0.9378290374191051};
		//double[] b = {0.5326909340407582,0.6551836103447579,0.18208344332647453,0.42719747732851465,0.5321170197820669,0.5637847045894908,0.5220253729993872};
		//System.out.println(Utility.computeCosine(a, b));
		//System.out.println(Utility.computeHellinger(a, b));
		
//		double[] data = {5, 2, 2, 2, 2};
//		System.out.println(Utility.computeEntropy(data));
	}
	
	public static String formatDoubleString(double number, int digits) {
		return String.format("%." + digits + "f", number);
	}
	
	public static double computeNDCG(double[] scores, int[] answers, int position) throws Exception {
		
		// DCG
		double[] ranks = Utility.scoreArrayToRankArrayRandomDescending(scores);
		TreeMap<Double, Integer> tm = new TreeMap<Double, Integer>();
		for(int i=0; i<ranks.length; i++) {
			tm.put(ranks[i], answers[i]);
		}
		double dcg = 0.0;
		int i = 1;
		for(double key : tm.keySet()) {
			if(i > position) {
				break;
			}
			else if(i == 1) {
				dcg += (double)tm.get(key);
			}
			else {
				dcg += (double)tm.get(key)/(double)Math.log((double)i);
			}
			i++;
		}
		
		// IDCG
		double idcg = 1.0;
		int answerPosition = position;
		int totalAnswer = 0;
		for(int j=0; j<answers.length; j++) {
			if(answers[j] == 1) {
				totalAnswer++;
			}			
		}
		if(answerPosition > totalAnswer) {
			answerPosition = totalAnswer;
		}
		for(int j=2; j<=answerPosition; j++) {
			idcg += (double)1.0/(double)Math.log((double)j);
		}
		
		// NDCG
		return (double)dcg/(double)idcg;	
	}
	
	public static double[][] matrixMultiplication(double[][] a, double[][] b) throws Exception {
		if(a[0].length != b.length) {
			return null;
		}
		else {
			double[][] c = new double[a.length][b[0].length];
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<b[0].length; j++) {
					c[i][j] = 0;
					for(int k=0; k<b.length; k++) {
						c[i][j] += a[i][k] * b[k][j];
					}
				}
			}
			return c;
		}
	}
	
	public static void copyFile(String inputFileName, String outputFileName, String encoding) throws Exception {
		FileInputStream fis = new FileInputStream(inputFileName);
		InputStreamReader isr = new InputStreamReader(fis, encoding);
		LineNumberReader lnr = new LineNumberReader(isr);
		FileOutputStream fos = new FileOutputStream(outputFileName);
		OutputStreamWriter osw = new OutputStreamWriter(fos, encoding);
		BufferedWriter bw = new BufferedWriter(osw);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			bw.write(s + "\n");
		}
		bw.flush();
		bw.close();
		osw.close();
		fos.close();
		lnr.close();
		isr.close();
		fis.close();
	}

	public static double[] linearInterpolation(double[] data, int length) {
		if(data.length == 0) {
			return data;
		}
		else if(data.length == 1) {
			double value = data[0];
			data = new double[2];
			data[0] = 0.0;
			data[1] = value;
		}
		double[] result = new double[length];
		int dataSize = data.length - 1;
		int targetSize = length - 1;
		result[0] = data[0];
		result[targetSize] = data[dataSize];
		for(int i=1; i<targetSize; i++) {
			int index = (int)((double)i*(double)dataSize/(double)targetSize);
			double l = data[index];
			double u = data[index+1];
			double lr = (double)index/(double)dataSize;
			double ur = (double)(index+1)/(double)dataSize;
			double tr = (double)i/(double)targetSize;
			result[i]= (double)(u-l)*(double)(tr-lr)/(double)(ur-lr) + l; 
		}
		return result;
	}
	
	public static int computeTrue(int[] a, int[] b) {
		int t = 0;
		if(a.length != b.length) {
			return -1;
		}
		for(int i=0; i<a.length; i++) {
			if(a[i] == b[i]) {
				t++;
			}
		}
		return t;
	}

	public static int computeFalse(int[] a, int[] b) {
		int f = 0;
		if(a.length != b.length) {
			return -1;
		}
		for(int i=0; i<a.length; i++) {
			if(a[i] != b[i]) {
				f++;
			}
		}
		return f;
	}

	public static double computeAccuracy(int[] a, int[] b) {
		int t = 0;
		int f = 0;
		if(a.length != b.length) {
			return -1.0;
		}
		for(int i=0; i<a.length; i++) {
			if(a[i] == b[i]) {
				t++;
			}
			else {
				f++;
			}
		}
		return (double)t/(double)(t+f);
	}
	
	public static int[] getKeysOfIntegerToIntegerTreeMap(TreeMap<Integer, Integer> tm, int value) {
		Vector<Integer> v = new Vector<Integer>();
		for(int key : tm.keySet()) {
			if(tm.get(key) == value) {
				v.add(key);
			}
		}
		return Utility.integerVectorToIntegerArray(v);
	}
	
	public static int firstIndexOfIntegerArray(int[] a, int v) {
		for(int i=0; i<a.length; i++) {
			if(a[i] == v) {
				return i;
			}
		}
		return -1;
	}
	
	public static int computeSubstring(String s, String sub) {
		int index = s.indexOf(sub);
		int count = 0;
		while(index != -1) {
			index = s.indexOf(sub, index+1);
			count++;
		}
		return count;
	}
	
	public static long randomSelectionWithPrior(TreeMap<Long, Double> idPrior, Random random) {

		// Normalization and sum
		TreeMap<Long, Double> normalized = normalizePrior(idPrior);
		double sum = sumPrior(normalized);

		// Random value
		double value = random.nextDouble()*sum;
		
		// Selection
		return selectPrior(normalized, value);
	}

	public static long selectPrior(TreeMap<Long, Double> idPrior, double value) {
		long target = -1;
		double priorSum = 0.0;
		for(long id : idPrior.keySet()) {
			priorSum += idPrior.get(id);
			if(priorSum > value) {
				target = id;
				break;
			}
		}
		return target;
	}

	public static double sumPrior(TreeMap<Long, Double> idPrior) {
		double sum = 0.0;
		for(long id : idPrior.keySet()) {
			sum += idPrior.get(id);
		}
		return sum;
	}
	
	// Set max prior to 1.0
	public static TreeMap<Long, Double> normalizePrior(TreeMap<Long, Double> idPrior) {
		TreeMap<Long, Double> normalized = new TreeMap<Long, Double>();
		double max = Double.MIN_VALUE;
		for(long id : idPrior.keySet()) {
			double prior = idPrior.get(id);
			if(max < prior) {
				max = prior;
			}
		}
		for(long id : idPrior.keySet()) {
			double prior = idPrior.get(id);
			normalized.put(id, prior/max);
		}
		return normalized;
	}

	public static TreeSet<String> listFileInAlphabeticalOrder(String dirName) {
		File dir = new File(dirName);
		TreeSet<String> fileNames = new TreeSet<String>();		
		for(String fileName : dir.list()) {
			fileNames.add(fileName);
		}
		return fileNames;
	}

	public static void printIntegerToDoubleTreeMap(TreeMap<Integer, Double> tm, int size) {
		int count = 0;
		for(int key : tm.keySet()) {
			if(count < size) {
				System.out.println(key + ", " + tm.get(key));
			}
			count++;
		}	
	}
	
	public static void printIntegerToIntegerTreeMap(TreeMap<Integer, Integer> tm, int size) {
		int count = 0;
		for(int key : tm.keySet()) {
			if(count < size) {
				System.out.println(key + ", " + tm.get(key));
			}
			count++;
		}	
	}

	public static TreeMap<Long, Double> getTopValuedLongToDoubleTreeMap(TreeMap<Long, Double> tm, int top, boolean isLarge) {
		TreeMap<Long, Double> result = new TreeMap<Long, Double>();
		long[] keys = getTopValuedLongToDoubleKeys(tm, top, isLarge);
		for(long key : keys) {
			result.put(key, tm.get(key));
		}
		return result;
	}
	
	public static TreeMap<Integer, Double> getTopValuedIntegerToDoubleTreeMap(TreeMap<Integer, Double> tm, int top, boolean isLarge) {
		TreeMap<Integer, Double> result = new TreeMap<Integer, Double>();
		int[] keys = getTopValuedIntegerToDoubleKeys(tm, top, isLarge);
		for(int key : keys) {
			result.put(key, tm.get(key));
		}
		return result;
	}

	public static TreeMap<Integer, Integer> getTopValuedIntegerToIngeterTreeMap(TreeMap<Integer, Integer> tm, int top, boolean isLarge) {
		TreeMap<Integer, Integer> result = new TreeMap<Integer, Integer>();
		int[] keys = getTopValuedIntegerToIntegerKeys(tm, top, isLarge);
		for(int key : keys) {
			result.put(key, tm.get(key));
		}
		return result;
	}

	public static long[] getTopValuedLongToDoubleKeys(TreeMap<Long, Double> tm, int top, boolean isLarge) {
		if(tm.size() <= top) {
			long[] keys = new long[tm.size()];
			int count = 0;
			for(long key : tm.keySet()) {
				keys[count] = key;
				count++;
			}
			return keys;
		}
		else {
			long[] keys = new long[top];
			double[] values = new double[top];
			int count = 0;
			for(long key : tm.keySet()) {
				double value = tm.get(key);
				if(count < top) {
					keys[count] = key;
					values[count] = value;
				}
				else {
					if(isLarge) {
						int minIndex = getMinIndex(values);
						if(values[minIndex] < value) {
							keys[minIndex] = key;
							values[minIndex] = value;
						}
					}
					else {
						int maxIndex = getMaxIndex(values);
						if(values[maxIndex] > value) {
							keys[maxIndex] = key;
							values[maxIndex] = value;
						}						
					}
				}
				count++;
			}
			return keys;
		}
	}
	
	public static int[] getTopValuedIntegerToDoubleKeys(TreeMap<Integer, Double> tm, int top, boolean isLarge) {
		if(top == 0) {
			return new int[0];
		}
		if(tm.size() <= top) {
			int[] keys = new int[tm.size()];
			int count = 0;
			for(int key : tm.keySet()) {
				keys[count] = key;
				count++;
			}
			return keys;
		}
		else {
			int[] keys = new int[top];
			double[] values = new double[top];
			int count = 0;
			for(int key : tm.keySet()) {
				double value = tm.get(key);
				if(count < top) {
					keys[count] = key;
					values[count] = value;
				}
				else {
					if(isLarge) {
						int minIndex = getMinIndex(values);
						if(values[minIndex] < value) {
							keys[minIndex] = key;
							values[minIndex] = value;
						}
					}
					else {
						int maxIndex = getMaxIndex(values);
						if(values[maxIndex] > value) {
							keys[maxIndex] = key;
							values[maxIndex] = value;
						}						
					}
				}
				count++;
			}
			return keys;
		}
	}
	
	public static int[] getTopValuedIntegerToIntegerKeys(TreeMap<Integer, Integer> tm, int top, boolean isLarge) {
		if(tm.size() <= top) {
			int[] keys = new int[tm.size()];
			int count = 0;
			for(int key : tm.keySet()) {
				keys[count] = key;
				count++;
			}
			return keys;
		}
		else {
			int[] keys = new int[top];
			int[] values = new int[top];
			int count = 0;
			for(int key : tm.keySet()) {
				int value = tm.get(key);
				if(count < top) {
					keys[count] = key;
					values[count] = value;
				}
				else {
					if(isLarge) {
						int minIndex = getMinIndex(values);
						if(values[minIndex] < value) {
							keys[minIndex] = key;
							values[minIndex] = value;
						}
					}
					else {
						int maxIndex = getMaxIndex(values);
						if(values[maxIndex] > value) {
							keys[maxIndex] = key;
							values[maxIndex] = value;
						}						
					}
				}
				count++;
			}
			return keys;
		}
	}
	
	public static String[] getTopValuedStringToDoubleKeys(TreeMap<String, Double> tm, int top, boolean isLarge) {
		if(top == 0) {
			return new String[0];
		}
		if(tm.size() <= top) {
			String[] keys = new String[tm.size()];
			int count = 0;
			for(String key : tm.keySet()) {
				keys[count] = key;
				count++;
			}
			return keys;
		}
		else {
			String[] keys = new String[top];
			double[] values = new double[top];
			int count = 0;
			for(String key : tm.keySet()) {
				double value = tm.get(key);
				if(count < top) {
					keys[count] = key;
					values[count] = value;
				}
				else {
					if(isLarge) {
						int minIndex = getMinIndex(values);
						if(values[minIndex] < value) {
							keys[minIndex] = key;
							values[minIndex] = value;
						}
					}
					else {
						int maxIndex = getMaxIndex(values);
						if(values[maxIndex] > value) {
							keys[maxIndex] = key;
							values[maxIndex] = value;
						}						
					}
				}
				count++;
			}
			return keys;
		}
	}

	public static void extractUniqueField(String inputFileName, String outputFileName, String regex, int field) throws Exception {
		TreeSet<String> ts = new TreeSet<String>();
		FileInputStream fis = new FileInputStream(inputFileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String sv = null;
		while ((sv=lnr.readLine()) != null) {
			String[] t = sv.split(regex);
			if(field < t.length) {
				String s = t[field];
				if(s.length() > 0) {
					ts.add(s);
				}
			}
		}
		lnr.close();
		isr.close();
		fis.close();
		Utility.saveStringTreeSet(ts, outputFileName);
	}

	public static int computeDifferenceInSeconds(Date startDate, Date endDate) {
		return (int)((long)Math.abs((long)(endDate.getTime()-startDate.getTime()))/ 1000);  
	}

	public static int computeDifferenceIn24Hours(Date startDate, Date endDate) {
		return (int)((long)Math.abs((long)(endDate.getTime()-startDate.getTime()))/ 86400000);  
	}

	public static int computeDifferenceInDays(Date startDate, Date endDate) {
		Date sd = getDays(startDate);
		Date se = getDays(endDate);		
		return computeDifferenceIn24Hours(sd, se);  
	}

	public static Date getDays(Date d) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(d);
		gc.set(Calendar.HOUR_OF_DAY, 0);
		gc.set(Calendar.MINUTE, 0);
		gc.set(Calendar.SECOND, 0);
		return gc.getTime();
	}

	public static double computeRankAUC(double[] rankArray) throws Exception {
		double rankAUC = 0;
		double[] sortedArray = Arrays.copyOf(rankArray, rankArray.length);
		Arrays.sort(sortedArray);
		//Utility.printDoubleArray(sortedArray, sortedArray.length);
		double unit = (double)1 / (double)Math.pow((double)sortedArray.length, 2);
		//System.out.println("unit = " + unit);
		int x = 0;
		double currentRank = sortedArray[0];
		for(int i=0; i<sortedArray.length; i++) {
			if(currentRank < sortedArray[i]) {			// Add to AUC
				rankAUC += (double)unit * (double)x * (double)i;		
				x = 1;
				currentRank = sortedArray[i];
				System.out.println(i + ", " + x + ", " + currentRank + ", " + rankAUC);
			}
			else if(currentRank == sortedArray[i] && i>=sortedArray[i]){	// Accumulate x
				x++;
			}
		}
		rankAUC += (double)unit * (double)x * (double)sortedArray.length;		
		System.out.println(sortedArray.length + ", " + x + ", " + rankAUC);
		return rankAUC;
	}
	
	public static void printVector(Vector<?> v) {
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println();
		System.out.println("Total = " + v.size());
		System.out.println();
	}

	public static void printStringVector(Vector<String> v) {
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println();
		System.out.println("Total = " + v.size());
		System.out.println();
	}
	
	public static void printStringTreeSet(TreeSet<String> ts) {
		for(String s: ts) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println("Total = " + ts.size());
		System.out.println();
	}
	
	public static void printStringHashSet(HashSet<String> hs) {
		for(String s: hs) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println("Total = " + hs.size());
		System.out.println();
	}
	
	public static void printStringHashMap(HashMap<String, String> hm) {
		for(String k: hm.keySet()) {
			System.out.println(k + " = " + hm.get(k));
		}
		System.out.println();
		System.out.println("Total = " + hm.size());
		System.out.println();
	}
	
	// Return true if all NaN positions are all the same
	public static boolean checkNaN(double[] x, double[] y) {
		boolean result = true;
		for(int i=0; i<x.length; i++) {
			boolean xNaN = Double.isNaN(x[i]); 
			boolean yNaN = Double.isNaN(y[i]);
			if(xNaN != yNaN) {
				result = false;
				break;
			}
		}
		return result;
	}

	// Return true if all zero positions are all the same
	public static boolean checkZero(double[] x, double[] y) {
		boolean result = true;
		for(int i=0; i<x.length; i++) {
			boolean xZero = (x[i]==0); 
			boolean yZero = (y[i]==0);
			if(xZero != yZero) {
				result = false;
				break;
			}
		}
		return result;
	}

	// Skip NaN; should call checkNaN() before this function
	public static double computeAbsoluteDifference(double[] x, double[] y) {
		double result = 0;
		for(int i=0; i<x.length; i++) {
			boolean xNaN = Double.isNaN(x[i]); 
			boolean yNaN = Double.isNaN(y[i]);
			if(!xNaN && !yNaN) {
				double diff = (double)x[i] - (double)y[i];
				result += Math.abs(diff);
				//System.out.println("feature = " + (i+1) + ", x = " + x[i] + ", y = " + y[i] + ", diff = " + diff + ", result = " + result);
			}
		}
		return result;
	}
	
	public static double computeSum(double[] data) {
		double sum = 0;
		for(int i=0; i<data.length; i++) {
			sum += data[i];
		}
		return sum;
	}
	
	public static double computeSkewness(double[] data) {
		double mean = computeMean(data);
		double sd = computeStandardDeviation(data);
		double numerator = 0;
		for(int i=0; i<data.length; i++) {
			numerator += Math.pow(data[i] - mean, 3);
		}
		double denominator = ((double)data.length - 1.0) * Math.pow(sd, 3);
		return numerator/denominator;
	}
	
	public static double computeKurtosis(double[] data) {
		double mean = computeMean(data);
		double sd = computeStandardDeviation(data);
		double numerator = 0;
		for(int i=0; i<data.length; i++) {
			numerator += Math.pow(data[i] - mean, 4);
		}
		double denominator = ((double)data.length - 1.0) * Math.pow(sd, 4);
		return numerator/denominator;
	}
	
	public static double computeMean(double[] data) {
		double sum = 0;
		for(int i=0; i<data.length; i++) {
			sum += data[i];
		}
		double mean = (double)sum / (double)data.length;
		return mean;
	}

	public static double computeStandardDeviation(double[] data) {
		double mean = computeMean(data);
		double sum = 0;
		for(int i=0; i<data.length; i++) {
			sum += (data[i] - mean) * (data[i] - mean);
		}
		double sd = Math.sqrt((double)sum / (double)data.length);
		return sd;	
	}

	public static double computeMeanWithNaN(double[] data) {
		double sum = 0;
		int count = 0;
		for(int i=0; i<data.length; i++) {
			if(!Double.isNaN(data[i])) {
				sum += data[i];
				count++;
			}
		}
		double mean = (double)sum / (double)count;
		return mean;
	}

	public static double computeStandardDeviationWithNaN(double[] data) {
		double mean = computeMeanWithNaN(data);
		double sum = 0;
		int count = 0;
		for(int i=0; i<data.length; i++) {
			if(!Double.isNaN(data[i])) {
				sum += (data[i] - mean) * (data[i] - mean);
				count++;
			}
		}
		double sd = Math.sqrt((double)sum / (double)count);
		return sd;	
	}

	public static double[] getValidData(double[] data, boolean[] valid) {
		int validCount = 0;
		for(int i=0; i<valid.length; i++) {
			if(valid[i]) {
				validCount++;
			}
		}
		
		double[] validData = new double[validCount];
		
		int count = 0;
		for(int i=0; i<valid.length; i++) {
			if(valid[i]) {
				validData[count] = data[i];
				count++;
			}
		}
		
		return validData;
	}
	
	public static double computeAccurateMean(double[] data) {
		return computeAccurateMean(data, 0, 0);
	}
	
	public static double computeAccurateMean(double[] data, double lastMean, int index) {
		double mean = 0;
		
		if(data.length == 1) {
			return data[0];
		}
		else if(data.length > 0) {
			if(index == 0) {
				mean = computeAccurateMean(data, data[0], 1);
			}
			else {
				double meanResult = lastMean + ( (double)(data[index] - lastMean) / (double)(index + 1) );
				
				if((index + 1) == data.length) {
					mean = meanResult;
				}
				else {
					mean = computeAccurateMean(data, meanResult, index + 1);
				}
			}
		}
		return mean;
	}

	public static double computeAccurateStandardDeviation(double[] data) {
		return computeAccurateStandardDeviation(data, 0, 0, 0);
	}
	
	public static double computeAccurateStandardDeviation(double[] data, double lastMean, double lastStandardDeviation, int index) {
		double sd = 0;
		
		if(data.length == 1) {
			return 0;
		}
		if(data.length > 0) {
			if(index == 0) {
				sd = computeAccurateStandardDeviation(data, data[0], 0, 1);
			}
			else {
				double meanResult = lastMean + ( (double)(data[index] - lastMean) / (double)(index + 1) );
				double sdResult = lastStandardDeviation + ( (data[index] - lastMean) * (data[index] - meanResult) );
				
				if((index + 1) == data.length) {
					sd = Math.sqrt((double)sdResult / (double)data.length);
				}
				else {
					sd = computeAccurateStandardDeviation(data, meanResult, sdResult, index + 1);
				}
			}
		}		
		return sd;
	}

	public static Vector<Integer> getShuffledVector(int size) {
		Random r = new Random();
		Vector<Integer> v = new Vector<Integer>();
		for(int i=0; i<size; i++) {
			v.add(new Integer(i));
		}
		Collections.shuffle(v, r);
		return v;
	}
	
	public static Vector<Integer> shuffleIntegerVector(Vector<Integer> v) {
		Random r = new Random();
		Vector<Integer> result = new Vector<Integer>(v);
		Collections.shuffle(result, r);
		return result;
	}
	
	public static Vector<Double> shuffleDoubleVector(Vector<Double> v) {
		Random r = new Random();
		Vector<Double> result = new Vector<Double>(v);
		Collections.shuffle(result, r);
		return result;
	}
	
	public static int[] shuffleIntegerArray(int[] data) {
		Random r = new Random();
		Vector<Integer> v = new Vector<Integer>();
		for(int i=0; i<data.length; i++) {
			v.add(data[i]);
		}
		Collections.shuffle(v, r);
		return integerVectorToIntegerArray(v);
	}
	
	public static double[] shuffleDoubleArray(double[] data) {
		Random r = new Random();
		Vector<Double> v = new Vector<Double>();
		for(int i=0; i<data.length; i++) {
			v.add(data[i]);
		}
		Collections.shuffle(v, r);
		return doubleVectorToDoubleArray(v);
	}

	public static double computeAndPrintMean(String measurement, double[] array) throws Exception {
		double mean = Utility.computeAccurateMean(array);
		System.out.println(measurement + " = " + String.format("%.4f", mean));
		return mean;
	}

	public static int getMaxIndex(long[] array) {
		double max = Long.MIN_VALUE;
		int index = 0;
		int count = 0;
		for(int i=0; i<array.length; i++) {
			if(max <= array[i]) {
				max = array[i];
				index = count;
			}
			count++;
		}
		return index;
	}
	
	public static int getMinIndex(long[] array) {
		double min = Long.MAX_VALUE;
		int index = 0;
		int count = 0;
		for(int i=0; i<array.length; i++) {
			if(min >= array[i]) {
				min = array[i];
				index = count;
			}
			count++;
		}
		return index;
	}
	
	public static int getMaxIndex(double[] array) {
		double max = Double.MIN_VALUE;
		int index = 0;
		int count = 0;
		for(int i=0; i<array.length; i++) {
			if(max <= array[i]) {
				max = array[i];
				index = count;
			}
			count++;
		}
		return index;
	}
	
	public static double getMin(double[] array) {
		double min = Double.MAX_VALUE;
		for(int i=0; i<array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static double getMax(double[] array) {
		double max = Double.MIN_VALUE;
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static double getMin(double[][] array) {
		double min = Double.MAX_VALUE;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[0].length; j++) {
				if(min > array[i][j]) {
					min = array[i][j];
				}
			}
		}
		return min;
	}
	
	public static double getMax(double[][] array) {
		double max = Double.MIN_VALUE;
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[0].length; j++) {
				if(max < array[i][j]) {
					max = array[i][j];
				}
			}
		}
		return max;
	}
	
	public static int getMinIndex(double[] array) {
		double min = Double.MAX_VALUE;
		int index = 0;
		int count = 0;
		for(int i=0; i<array.length; i++) {
			if(min >= array[i]) {
				min = array[i];
				index = count;
			}
			count++;
		}
		return index;
	}
	
	public static int getMaxIndex(int[] array) {
		double max = Integer.MIN_VALUE;
		int index = 0;
		int count = 0;
		for(int i=0; i<array.length; i++) {
			if(max <= array[i]) {
				max = array[i];
				index = count;
			}
			count++;
		}
		return index;
	}
	
	public static int getMinIndex(int[] array) {
		double min = Integer.MAX_VALUE;
		int index = 0;
		int count = 0;
		for(int i=0; i<array.length; i++) {
			if(min >= array[i]) {
				min = array[i];
				index = count;
			}
			count++;
		}
		return index;
	}
	
	public static int getMaxScoreIndex(double[] scoreArray) {
		double maxScore = 0;
		int maxIndex = 0;
		int count = 0;
		for(int i=0; i<scoreArray.length; i++) {
			if(maxScore <= scoreArray[i]) {
				maxScore = scoreArray[i];
				maxIndex = count;
			}
			count++;
		}
		return maxIndex;
	}
	
	public static int getMinScoreIndex(double[] scoreArray) {
		double minScore = 1;
		int minIndex = 0;
		int count = 0;
		for(int i=0; i<scoreArray.length; i++) {
			if(minScore >= scoreArray[i]) {
				minScore = scoreArray[i];
				minIndex = count;
			}
			count++;
		}
		return minIndex;
	}
	
	public static int getActualRankingDescending(double[] scoreArray, int actualIndex) {
		int actualRank = -1;
		double actualValue = scoreArray[actualIndex];
		double[] sortedArray = Arrays.copyOf(scoreArray, scoreArray.length);
		Arrays.sort(sortedArray);
		for(int i=sortedArray.length-1; i>=0; i--) {
			if(sortedArray[i] < actualValue) {
				break;
			}
			actualRank++;
		}
		return actualRank;
	}

	public static int getActualRankingAscending(double[] scoreArray, int actualIndex) {
		int actualRank = -1;
		double actualValue = scoreArray[actualIndex];
		double[] sortedArray = Arrays.copyOf(scoreArray, scoreArray.length);
		Arrays.sort(sortedArray);
		for(int i=0; i<sortedArray.length; i++) {
			if(sortedArray[i] > actualValue) {
				break;
			}
			actualRank++;
		}
		return actualRank;
	}

	public static long[] longVectorToLongArray(Vector<Long> v) {
		long[] a = new long[v.size()];
		for(int i=0; i<a.length; i++) {
			a[i] = v.get(i);
		}		
		return a;
	}

	public static double[] doubleVectorToDoubleArray(Vector<Double> v) {
		double[] a = new double[v.size()];
		for(int i=0; i<a.length; i++) {
			a[i] = v.get(i);
		}		
		return a;
	}
	
	public static double[][] double2DVectorToDouble2DArray(Vector<Vector<Double>> v) {
		double[][] a = new double[v.size()][v.get(0).size()];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				a[i][j] = v.get(i).get(j);
			}
		}		
		return a;
	}
	
	public static int[][] integer2DVectorToInteger2DArray(Vector<Vector<Integer>> v) {
		int[][] a = new int[v.size()][v.get(0).size()];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				a[i][j] = v.get(i).get(j);
			}
		}		
		return a;
	}

	public static int[] integerVectorToIntegerArray(Vector<Integer> v) {
		int[] a = new int[v.size()];
		for(int i=0; i<a.length; i++) {
			a[i] = v.get(i);
		}		
		return a;
	}

	public static String[] stringVectorToStringArray(Vector<String> v) {
		String[] stringArray = new String[v.size()];
		for(int i=0; i<stringArray.length; i++) {
			stringArray[i] = (String)v.get(i);
		}	
		return stringArray;
	}

	public static double[] integerArrayToDoubleArray(int[] ai) {
		double[] ad = new double[ai.length];
		for(int i=0; i<ai.length; i++) {
			ad[i] = (double)ai[i];
		}		
		return ad;
	}

	public static double[] reverseArray(double[] data) {
		return reverseDoubleArray(data);
	}
	
	public static double[] reverseDoubleArray(double[] data) {
		double[] reversedArray = new double[data.length];
		for(int i=0; i<data.length; i++) {
			reversedArray[i] = data[data.length-1-i];
		}
		return reversedArray;
	}
	
	public static String[] reverseStringArray(String[] data) {
		String[] reversedArray = new String[data.length];
		for(int i=0; i<data.length; i++) {
			reversedArray[i] = data[data.length-1-i];
		}
		return reversedArray;
	}
	
	public static double getSortedArrayRank(double score, double[] sortedArray) {	
		Vector<Integer> v = new Vector<Integer>();
		for(int j=0; j<sortedArray.length; j++) {
			if(score == sortedArray[j]) {
				v.add(j);
			}
		}
		return computeMean(integerArrayToDoubleArray(integerVectorToIntegerArray(v)));
	}

	public static int[] scoreArrayToBinaryArrayAscending(double[] scoreArray) {
		double[] rankArray = scoreArrayToRankArrayRandomAscending(scoreArray);
		int[] binaryArray = new int[rankArray.length];
		double middle = Utility.getMax(rankArray)/2;
		for(int i=0; i<rankArray.length; i++) {
			if(rankArray[i] < middle) {
				binaryArray[i] = 0;
			}
			else {
				binaryArray[i] = 1;
			}
		}
		return binaryArray;
	}
	
	public static double[] scoreArrayToRankArrayAscending(double[] scoreArray) {
		return scoreArrayToRankArrayAverageAscending(scoreArray);
	}
	
	public static double[] scoreArrayToRankArrayAverageAscending(double[] scoreArray) {
		int length = scoreArray.length;
		double[] rankArray = new double[length];
		double[] sortedArray = Arrays.copyOf(scoreArray, length);
		Arrays.sort(sortedArray);
		for(int i=0; i<length; i++) {
			rankArray[i] = getSortedArrayRank(scoreArray[i], sortedArray);
		}
		return rankArray;
	}
	
	public static double[] scoreArrayToRankArrayRandomAscending(double[] scoreArray) {
		Random r = new Random();
		int length = scoreArray.length;
		String[] sortedArray = new String[length];
		for(int i=0; i<length; i++) {
			sortedArray[i] = scoreArray[i] + "_" + i;
		}
		Arrays.sort(sortedArray);
		double old = Double.parseDouble(sortedArray[0].split("_")[0]);
		Vector<Double> v = new Vector<Double>(); 
		Vector<Double> rankVector = new Vector<Double>();
		for(int i=0; i<length-1; i++) {
			double current = Double.parseDouble(sortedArray[i+1].split("_")[0]); 
			if(current == old) {
				v.add((double)i);
			}
			else {
				v.add((double)i);
				Collections.shuffle(v, r);
				rankVector.addAll(v);
				v.removeAllElements();
			}
			old = current;
		}
		v.add((double)length-1);
		Collections.shuffle(v, r);
		rankVector.addAll(v);
		double[] result = new double[length];
		for(int i=0; i<length; i++) {
			int index = Integer.parseInt(sortedArray[i].split("_")[1]);
			result[index] = rankVector.get(i);
		}
		return result;
	}
	
	public static int[] scoreArrayToBinaryArrayDescending(double[] scoreArray) {
		double[] rankArray = scoreArrayToRankArrayRandomDescending(scoreArray);
		int[] binaryArray = new int[rankArray.length];
		double middle = Utility.getMax(rankArray)/2;
		for(int i=0; i<rankArray.length; i++) {
			if(rankArray[i] < middle) {
				binaryArray[i] = 0;
			}
			else {
				binaryArray[i] = 1;
			}
		}
		return binaryArray;
	}
	
	public static double[] scoreArrayToRankArrayDescending(double[] scoreArray) {
		return scoreArrayToRankArrayAverageDescending(scoreArray);
	}

	public static double[] scoreArrayToRankArrayAverageDescending(double[] scoreArray) {
		int length = scoreArray.length;
		double[] rankArray = new double[length];
		double[] sortedArray = Arrays.copyOf(scoreArray, length);
		Arrays.sort(sortedArray);
		sortedArray = reverseDoubleArray(sortedArray);
		for(int i=0; i<length; i++) {
			rankArray[i] = getSortedArrayRank(scoreArray[i], sortedArray);
		}
		return rankArray;
	}

	public static double[] scoreArrayToRankArrayRandomDescending(double[] scoreArray) {
		Random r = new Random();
		int length = scoreArray.length;
		String[] sortedArray = new String[length];
		for(int i=0; i<length; i++) {
			sortedArray[i] = scoreArray[i] + "_" + i;
		}
		Arrays.sort(sortedArray);
		sortedArray = reverseStringArray(sortedArray);
		double old = Double.parseDouble(sortedArray[0].split("_")[0]);
		Vector<Double> v = new Vector<Double>(); 
		Vector<Double> rankVector = new Vector<Double>();
		for(int i=0; i<length-1; i++) {
			double current = Double.parseDouble(sortedArray[i+1].split("_")[0]); 
			if(current == old) {
				v.add((double)i);
			}
			else {
				v.add((double)i);
				Collections.shuffle(v, r);
				rankVector.addAll(v);
				v.removeAllElements();
			}
			old = current;
		}
		v.add((double)length-1);
		Collections.shuffle(v, r);
		rankVector.addAll(v);
		double[] result = new double[length];
		for(int i=0; i<length; i++) {
			int index = Integer.parseInt(sortedArray[i].split("_")[1]);
			result[index] = rankVector.get(i);
		}
		return result;
	}
	
	public static void printDoubleArrayForFile(double[] array, int size, PrintWriter pw) {
		pw.print("{");
		for(int i=0; i<size; i++) {
			if(i > 0) {
				pw.print(",");
			}
			pw.print(String.format("%.4f", array[i]));
		}
		pw.print("}");
	}
	
	public static void printDoubleArray(double[] array, int size) {
		System.out.print("{");
		for(int i=0; i<size; i++) {
			if(i > 0) {
				System.out.print(", ");
			}
			System.out.print(String.format("%.4f", array[i]));
		}
		System.out.println("}");
	}

	public static void printFloatArray(float[] array, int size) {
		System.out.print("{");
		for(int i=0; i<size; i++) {
			if(i > 0) {
				System.out.print(", ");
			}
			System.out.print(String.format("%.4f", array[i]));
		}
		System.out.println("}");
	}
	
	public static void printInteger2DArray(int[][] array, int size1, int size2) {
		System.out.print("{");
		for(int i=0; i<size1; i++) {
			System.out.print("{");
			for(int j=0; j<size2; j++) {
				if(j > 0) {
					System.out.print(", ");
				}
				System.out.print(array[i][j]);
			}
			System.out.print("}");
			if(i == size1-1) {
				System.out.println("}");
			}
			else {
				System.out.println(",");
				System.out.print(" ");
			}
		}
	}
	
	public static void printDouble2DArray(double[][] array, int size1, int size2) {
		System.out.print("{");
		for(int i=0; i<size1; i++) {
			System.out.print("{");
			for(int j=0; j<size2; j++) {
				if(j > 0) {
					System.out.print(", ");
				}
				System.out.print(array[i][j]);
			}
			System.out.print("}");
			if(i == size1-1) {
				System.out.println("}");
			}
			else {
				System.out.println(",");
				System.out.print(" ");
			}
		}
	}
	
	public static void printIntegerArrayForFile(int[] array, int size, PrintWriter pw) {
		pw.print("{");
		for(int i=0; i<size; i++) {
			if(i > 0) {
				pw.print(",");
			}
			pw.print(array[i]);
		}
		pw.print("}");
	}

	public static void printIntegerArray(int[] array, int size) {
		System.out.print("{");
		for(int i=0; i<size; i++) {
			if(i > 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println("}");
	}
	
	public static void printLongArray(long[] array, int size) {
		System.out.print("{");
		for(int i=0; i<size; i++) {
			if(i > 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println("}");
	}
	
	public static void printStringArray(String[] array, int size) {
		System.out.print("{");
		for(int i=0; i<size; i++) {
			if(i > 0) {
				System.out.print(", ");
			}
			System.out.print(array[i]);
		}
		System.out.println("}");
		System.out.println();
	}

	public static double[][] getNormalized2DArray(double[][] array) {
		double[][] normalizedArray = new double[array.length][array[0].length];
		double min = getMin(array);
		double max = getMax(array);
		double normalizeFactor = 1;		
		if(max == min) {
			for(int i=0; i<array.length; i++) {
				for(int j=0; j<array[0].length; j++) {
					normalizedArray[i][j] = 1.0;
				}
			}		
			return normalizedArray;				
		}
		normalizeFactor = (double)1 / (double)(max - min);
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[0].length; j++) {
				normalizedArray[i][j] = (double)normalizeFactor * (double)(array[i][j] - min);
			}
		}		
		return normalizedArray;
	}

	public static double[] getNormalizedArray(double[] array) {
		double[] normalizedArray = new double[array.length];
		int maxIndex = getMaxIndex(array);
		int minIndex = getMinIndex(array);
		double max = array[maxIndex];
		double min = array[minIndex];		
		double normalizeFactor = 1.0;		
		if(max == min) {
			for(int i=0; i<array.length; i++) {
				normalizedArray[i] = 1;
			}		
			return normalizedArray;				
		}
		normalizeFactor = (double)1 / (double)(max - min);
		for(int i=0; i<array.length; i++) {
			normalizedArray[i] = (double)normalizeFactor * (double)(array[i] - min);
		}		
		return normalizedArray;
	}
	
	public static double[] getNormalizedArray(int[] array) {
		
		double[] normalizedArray = new double[array.length];
		int maxIndex = getMaxIndex(array);
		int minIndex = getMinIndex(array);
		int max = array[maxIndex];
		int min = array[minIndex];
		
		double normalizeFactor = 1;
		
		if(max == min) {
			for(int i=0; i<array.length; i++) {
				normalizedArray[i] = 1;
			}		
			return normalizedArray;				
		}
		normalizeFactor = (double)1 / (double)(max - min);
		for(int i=0; i<array.length; i++) {
			normalizedArray[i] = (double)normalizeFactor * (double)(array[i] - min);
		}		
		return normalizedArray;
	}
	
	public static double[] getNormalizedArray(long[] array) {
		
		double[] normalizedArray = new double[array.length];
		int maxIndex = getMaxIndex(array);
		int minIndex = getMinIndex(array);
		long max = array[maxIndex];
		long min = array[minIndex];
		
		double normalizeFactor = 1;
		
		if(max == min) {
			for(int i=0; i<array.length; i++) {
				normalizedArray[i] = 1;
			}		
			return normalizedArray;				
		}
		normalizeFactor = (double)1 / (double)(max - min);
		for(int i=0; i<array.length; i++) {
			normalizedArray[i] = (double)normalizeFactor * (double)(array[i] - min);
		}		
		return normalizedArray;
	}
	
	public static double[] getNormalizedScoreArray(double[] scoreArray) {
		double[] normalizedScoreArray = new double[scoreArray.length];
		int maxScoreIndex = getMaxScoreIndex(scoreArray);
		double normalizeFactor = 1;
		if(scoreArray[maxScoreIndex] != 0) {
			normalizeFactor = (double)1 / (double)scoreArray[maxScoreIndex];
		}
		for(int i=0; i<scoreArray.length; i++) {
			normalizedScoreArray[i] = (double)normalizeFactor * (double)scoreArray[i];
		}		
		return normalizedScoreArray;
	}

	public static double[] getNormalizedSumScoreArray(double[] scoreArray) {
		double[] normalizedScoreArray = new double[scoreArray.length];
		double arraySum = 0;
		for(int i=0; i<scoreArray.length; i++) {
			arraySum += scoreArray[i];
		}
		double normalizeFactor = (double)1 / (double)arraySum;
		for(int i=0; i<scoreArray.length; i++) {
			normalizedScoreArray[i] = (double)normalizeFactor * (double)scoreArray[i];
		}		
		return normalizedScoreArray;
	}


	public static TreeMap<Long, Double> getNormalizedLongToIntegerTreeMap(TreeMap<Long, Integer> input) { 	
		TreeMap<Long, Double> output = new TreeMap<Long, Double>();
		long max = 0;
		for(long k : input.keySet()) {
			long v = input.get(k);
			if(max < v) {
				max = v;
			}
		}
		for(long k : input.keySet()) {
			output.put(k, (double)input.get(k)/(double)max);
		}
		return output;
	}
	
	public static double[] generateRandomScoreArray(int size) {
		double[] scoreArray = new double[size];		
		Random rand = new Random();
		for(int i=0; i<size; i++) {
			scoreArray[i] = rand.nextDouble();
		}
		return scoreArray;
	}
	
	public static Vector<String> uniqueStringVector(Vector<String> add) {
		Vector<String> unique = new Vector<String>();
		for(int p=0; p<add.size(); p++) {
			String s = (String)add.get(p);
			boolean isUnique = true;
			for(int q=0; q<unique.size(); q++) {
				if(((String)unique.get(q)).equalsIgnoreCase(s)) {
					isUnique = false;
				}
			}
			if(isUnique) {
				unique.add(s);
			}
		}
		return unique;
	}
	
	public static Vector<String> uniqueStringVectorAdd(Vector<String> unique, Vector<String> add) {
		for(int p=0; p<add.size(); p++) {
			String s = (String)add.get(p);
			boolean isUnique = true;
			for(int q=0; q<unique.size(); q++) {
				if(((String)unique.get(q)).equalsIgnoreCase(s)) {
					isUnique = false;
				}
			}
			if(isUnique) {
				unique.add(s);
			}
		}
		return unique;
	}
	
	public static String[] stringArrayAdd(String[] x, String[] y) {
		String[] result = new String[x.length + y.length];
		for(int i=0; i<result.length; i++) {
			if(i < x.length) {
				result[i] = x[i];
			}
			else {
				result[i] = y[i - x.length];
			}
		}
		return result;
	}
	
	public static double[] uniqueDoubleArray(double[] add) {
		Vector<Double> uniqueVector = new Vector<Double>();
		for(int p=0; p<add.length; p++) {
			Double s = add[p];
			boolean isUnique = true;
			for(int q=0; q<uniqueVector.size(); q++) {
				double u = uniqueVector.get(q);
				if(u == s) {
					isUnique = false;
				}
			}
			if(isUnique) {
				uniqueVector.add(s);
			}
		}
		double[] unique = Utility.doubleVectorToDoubleArray(uniqueVector);
		return unique;
	}

	public static String[] uniqueStringArray(String[] add) {
		Vector<String> uniqueVector = new Vector<String>();
		for(int p=0; p<add.length; p++) {
			String s = add[p];
			boolean isUnique = true;
			for(int q=0; q<uniqueVector.size(); q++) {
				String u = (String)uniqueVector.get(q);
				if(u.equalsIgnoreCase(s)) {
					isUnique = false;
				}
			}
			if(isUnique) {
				uniqueVector.add(s);
			}
		}
		String[] unique = Utility.stringVectorToStringArray(uniqueVector);
		return unique;
	}
	
	public static String[] uniqueStringArrayAdd(String[] unique, String[] add) {
		Vector<String> uniqueVector = new Vector<String>();
		for(int i=0; i<unique.length; i++) {
			uniqueVector.add(unique[i]);
		}		
		for(int p=0; p<add.length; p++) {
			String s = add[p];
			boolean isUnique = true;
			for(int q=0; q<unique.length; q++) {
				if(unique[q].equalsIgnoreCase(s)) {
					isUnique = false;
				}
			}
			if(isUnique) {
				uniqueVector.add(s);
				unique = Utility.stringVectorToStringArray(uniqueVector);
			}
		}
		return unique;
	}
	
	public static int computeSameWords(String[] x, String[] y) {
		int result = 0;
		for(int p=0; p<x.length; p++) {
			String xWord = x[p];
			if(xWord!=null && !xWord.equalsIgnoreCase("")) {
				for(int q=0; q<y.length; q++) {
					String yWord = y[q];
					if(yWord!=null && !yWord.equalsIgnoreCase("")) {
						if(xWord.equalsIgnoreCase(yWord)) {
							result++;
							//System.out.println(xWord);
						}
					}
				}
			}
		}
		return result;
	}

	public static String[] removeStopWords(String[] x) {
		String[] result = new String[x.length];
		
		for(int i=0; i<x.length; i++) {
			if(x[i]!=null) {
				if(x[i].equalsIgnoreCase("and") || 
						x[i].equalsIgnoreCase("or") ||
						x[i].equalsIgnoreCase("of") ||
						x[i].equalsIgnoreCase("in") ||
						x[i].equalsIgnoreCase("on") ||
						x[i].equalsIgnoreCase("by") ||
						x[i].equalsIgnoreCase("as") ||
						x[i].equalsIgnoreCase("among") ||
						x[i].equalsIgnoreCase("the")) {
					result[i] = "";
				}
				else {
					result[i] = x[i];
				}
			}
		}
		
		return result;
	}
	
	public static double computeCorrelationCoefficient(double[] x, double[] y) {
		double xMean = computeMean(x);
		double yMean = computeMean(y);
		double xSD = computeStandardDeviation(x);
		double ySD = computeStandardDeviation(y);
		double[] meanDifference = new double[x.length];
		for(int i=0; i<x.length; i++) {
			meanDifference[i] = (x[i] - xMean) * (y[i] - yMean); 
		}
		double covariance = computeMean(meanDifference);
		double SDP = xSD * ySD;
		double CC = 0;
		if(SDP == 0) {
			CC = 0;
		}
		else {
			CC = (double)covariance / (double)SDP;
		}
		return CC;
	}

	public static Vector<String> loadStringVector(String fileName) throws Exception {
		Vector<String> v = new Vector<String>();
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			v.add(s);
		}					
		lnr.close();
		isr.close();
		fis.close();
		return v;
	}

	public static Vector<String> loadVector(String fileName) throws Exception {
		Vector<String> v = new Vector<String>();
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			v.add(s);
		}					
		lnr.close();
		isr.close();
		fis.close();
		return v;
	}

	public static Vector<Vector<Double>> loadDouble2DVector(String fileName) throws Exception {
		return loadDouble2DVector(fileName, ",");
	}
	
	public static Vector<Vector<Double>> loadDouble2DVector(String fileName, String delimiter) throws Exception {
		Vector<Vector<Double>> v = new Vector<Vector<Double>>();
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			String[] t = s.split(delimiter);
			Vector<Double> r = new Vector<Double>();
			for(String i : t) {
				r.add(Double.valueOf(i.trim()));
			}
			v.add(r);
		}					
		lnr.close();
		isr.close();
		fis.close();
		return v;
	}

	public static Vector<Vector<Integer>> loadInteger2DVector(String fileName) throws Exception {
		return loadInteger2DVector(fileName, ",");
	}
	
	public static Vector<Vector<Integer>> loadInteger2DVector(String fileName, String delimiter) throws Exception {
		Vector<Vector<Integer>> v = new Vector<Vector<Integer>>();
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			String[] t = s.split(delimiter);
			Vector<Integer> r = new Vector<Integer>();
			for(String i : t) {
				r.add(Integer.valueOf(i.trim()));
			}
			v.add(r);
		}					
		lnr.close();
		isr.close();
		fis.close();
		return v;
	}

	public static Vector<Long> loadLongVector(String fileName) throws Exception {
		Vector<Long> v = new Vector<Long>();
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			v.add(Long.valueOf(s));
		}					
		lnr.close();
		isr.close();
		fis.close();
		return v;
	}
	
	public static Vector<Integer> loadIntegerVector(String fileName) throws Exception {
		Vector<Integer> v = new Vector<Integer>();
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			v.add(Integer.valueOf(s));
		}					
		lnr.close();
		isr.close();
		fis.close();
		return v;
	}
	
	public static Vector<Double> loadDoubleVector(String fileName) throws Exception {
		Vector<Double> v = new Vector<Double>();
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			v.add(Double.valueOf(s));
		}					
		lnr.close();
		isr.close();
		fis.close();
		return v;
	}
	
	public static TreeSet<Long> loadLongTreeSet(String fileName) throws Exception {
		TreeSet<Long> ts = new TreeSet<Long>();
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			ts.add(Long.valueOf(s));
		}					
		lnr.close();
		isr.close();
		fis.close();
		return ts;
	}
	
	public static TreeSet<String> loadStringTreeSet(String fileName) throws Exception {
		TreeSet<String> ts = new TreeSet<String>();
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			ts.add(s);
		}					
		lnr.close();
		isr.close();
		fis.close();
		return ts;
	}

	public static double[] loadDoubleArray (String fileName) throws Exception {
		return doubleVectorToDoubleArray(loadDoubleVector(fileName));
	}

	public static double[][] loadDouble2DArray (String fileName) throws Exception {
		return double2DVectorToDouble2DArray(loadDouble2DVector(fileName));
	}

	public static double[][] loadDouble2DArray (String fileName, String delimiter) throws Exception {
		return double2DVectorToDouble2DArray(loadDouble2DVector(fileName, delimiter));
	}

	public static int[][] loadInteger2DArray (String fileName) throws Exception {
		return integer2DVectorToInteger2DArray(loadInteger2DVector(fileName));
	}

	public static int[][] loadInteger2DArray (String fileName, String delimiter) throws Exception {
		return integer2DVectorToInteger2DArray(loadInteger2DVector(fileName, delimiter));
	}

	public static long[] loadLongArray (String fileName) throws Exception {
		return longVectorToLongArray(loadLongVector(fileName));
	}

	public static int[] loadIntegerArray (String fileName) throws Exception {
		return integerVectorToIntegerArray(loadIntegerVector(fileName));
	}

	public static String[] loadStringArray (String fileName) throws Exception {
		return stringVectorToStringArray(loadVector(fileName));
	}

	public static void saveInteger2DArray(String fileName, int[][] a) throws Exception {
		saveInteger2DArray(fileName, a, ",");
	}
	
	public static void saveInteger2DArray(String fileName, int[][] a, String delimiter) throws Exception {
		PrintWriter pw = new PrintWriter(fileName);
		for(int i=0; i<a.length; i++) {
			pw.print(a[i][0]);
			for(int j=1; j<a[0].length; j++) {
				pw.print(delimiter + a[i][j]);
			}
			pw.println();
		}
		pw.flush();
		pw.close();
	}

	public static void saveIntegerArray(String fileName, int[] a) throws Exception {
		PrintWriter pw = new PrintWriter(fileName);
		for(int i=0; i<a.length; i++) {
			pw.println(a[i]);
		}
		pw.flush();
		pw.close();
	}
	
	public static void saveLong2DArray(String fileName, long[][] a) throws Exception {
		saveLong2DArray(fileName, a, ",");
	}
	
	public static void saveLong2DArray(String fileName, long[][] a, String delimiter) throws Exception {
		PrintWriter pw = new PrintWriter(fileName);
		for(int i=0; i<a.length; i++) {
			pw.print(a[i][0]);
			for(int j=1; j<a[0].length; j++) {
				pw.print(delimiter + a[i][j]);
			}
			pw.println();
		}
		pw.flush();
		pw.close();
	}

	public static void saveDouble2DArray(String fileName, double[][] a) throws Exception {
		saveDouble2DArray(fileName, a, ",");
	}
	
	public static void saveDouble2DArray(String fileName, double[][] a, String delimiter) throws Exception {
		PrintWriter pw = new PrintWriter(fileName);
		for(int i=0; i<a.length; i++) {
			pw.print(a[i][0]);
			for(int j=1; j<a[0].length; j++) {
				pw.print(delimiter + a[i][j]);
			}
			pw.println();
		}
		pw.flush();
		pw.close();
	}

	public static void saveDoubleArray(String fileName, double[] a) throws Exception {
		PrintWriter pw = new PrintWriter(fileName);
		for(int i=0; i<a.length; i++) {
			pw.println(a[i]);
		}
		pw.flush();
		pw.close();
	}
	
	public static void saveStringArray(String fileName, String[] a) throws Exception {
		PrintWriter pw = new PrintWriter(fileName);
		for(int i=0; i<a.length; i++) {
			pw.println(a[i]);
		}
		pw.flush();
		pw.close();
	}
	
	public static void saveVector(String fileName, Vector<?> v) throws Exception {
		PrintWriter pw = new PrintWriter(fileName);
		for(int i=0; i<v.size(); i++) {
			pw.println(v.get(i));
		}
		pw.flush();
		pw.close();
	}

	public static void saveStringVector(String fileName, Vector<String> v) throws Exception {
		FileOutputStream fos = new FileOutputStream(fileName);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		for(int i=0; i<v.size(); i++) {
			bw.write(v.get(i) + "\n");
		}
		bw.flush();
		bw.close();
		osw.close();
		fos.close();
	}

	public static int discreteByLog(int i, int discreteLevel) {
		if(i == 0) {
			return 0;
		}
		else {
			double d = Math.log10((double)i);
			d = (double)d * (double)discreteLevel;
			d = Math.floor(d);
			d = (double)d / (double)discreteLevel;
			int di = (int)Math.pow(10, d);
			return di;
		}
	}
	
	public static long discreteByLog(long i, int discreteLevel) {
		if(i == 0) {
			return 0;
		}
		else {
			double d = Math.log10((double)i);
			d = (double)d * (double)discreteLevel;
			d = Math.floor(d);
			d = (double)d / (double)discreteLevel;
			long di = (long)Math.pow(10, d);
			return di;
		}
	}

	public static double computeConfidenceInterval(double[] data, double confidenceLevel) throws Exception {
		double stdev = computeStandardDeviation(data);
		return computeConfidenceInterval(stdev, confidenceLevel, data.length);
	}
	
	public static double computeConfidenceInterval(double standardDeviation, double confidenceLevel, int sampleNumber) throws Exception {
		NormalDistribution nd = new NormalDistributionImpl();
		double zProbability = -nd.inverseCumulativeProbability((double)(1 - confidenceLevel) / (double)2);
		double confidenceInterval = (double)((double)zProbability * (double)standardDeviation) / (double)Math.sqrt(sampleNumber);
		return confidenceInterval;
	}

	public static double computeAndPrintStatistics(String measurement, double[] array, double confidenceLevel, int sampleNumber) throws Exception {
		double mean = Utility.computeAccurateMean(array);
		double sd = Utility.computeAccurateStandardDeviation(array);
		double confidenceInterval = Utility.computeConfidenceInterval(sd, confidenceLevel, sampleNumber);
		System.out.println();
		System.out.println(measurement + ":");
		System.out.println("  Mean = " + String.format("%.4f", mean));
		System.out.println("  Standard Deviation = " + String.format("%.4f", sd));
		System.out.println("  " + String.format("%.0f", confidenceLevel*100) + "% C.I. = " + String.format("%.4f", mean) + " +- " + String.format("%.4f", confidenceInterval));
		return mean;
	}
	
	public static String getHtml(String address, String parameter, String encoding, boolean keepCRLF) throws Exception {

		
		while(true) {
			try {
				String html = getHtmlOnce(address, parameter, encoding, keepCRLF);
				return html;
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public static String getHtmlOnce(String address, String parameter, String encoding, boolean keepCRLF) throws Exception {

		String crlf = "";
		if(keepCRLF == true) {
			crlf = "\n";
		}

		URL url = new URL(address);
		InputStream is;
		OutputStream os;
		HttpURLConnection connection = (HttpURLConnection)url.openConnection();		
		//connection.setConnectTimeout(100000);
		//connection.setReadTimeout(100000);
		connection.setRequestProperty("User-Agent","Mozilla/4.0 (compatible; MSIE 5.0; Windows XP; DigExt)");
		
		if(!parameter.equalsIgnoreCase("")) {
			connection.setRequestMethod("POST");   
			connection.setDoInput(true);
			connection.setDoOutput(true);
	        connection.setUseCaches(false);
	        connection.setInstanceFollowRedirects(true);
		}
        
		connection.connect(); 

		if(!parameter.equalsIgnoreCase("")) {
			os = connection.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.write(parameter.getBytes());
			dos.flush();
			dos.close();
			os.flush();
			os.close();
		}

		is = connection.getInputStream();
		InputStreamReader isr = null;
		if(encoding.equalsIgnoreCase("")) {
			isr = new InputStreamReader(is);										
		}
		else {
			isr = new InputStreamReader(is, encoding);					
		}
		BufferedReader br = new BufferedReader(isr); 
		
		String html = "";
		String currentLine = "";
		
		while ((currentLine = br.readLine()) != null) { 
			html += (currentLine + crlf); 
		}

		br.close();
		isr.close();
		is.close();
		connection.disconnect();
		
		return html;
	}
	
	public static void downloadFileWithoutCRLF(String address, String fileName) throws Exception {
		URL url = new URL(address);
		URLConnection urlc = url.openConnection();
		BufferedInputStream bis = new BufferedInputStream(urlc.getInputStream());
		FileOutputStream fos = new FileOutputStream(fileName);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
        int i;
        while ((i = bis.read()) != -1) {
        	if(i!=10 && i!=13) {
        		bos.write( i );
        	}
        }
        bos.flush();
		bos.close();
		fos.flush();
		fos.close();
		bis.close();
	}
	
	public static void downloadFile(String address, String fileName) throws Exception {
		URL url = new URL(address);
		URLConnection urlc = url.openConnection();
		BufferedInputStream bis = new BufferedInputStream(urlc.getInputStream());
		FileOutputStream fos = new FileOutputStream(fileName);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
        int i;
        while ((i = bis.read()) != -1) {
        	bos.write( i );
        }
        bos.flush();
		bos.close();
		fos.flush();
		fos.close();
		bis.close();
	}
	
	public static void saveString(String fileName, String string) throws Exception {
		PrintWriter pw = new PrintWriter(fileName);
		pw.println(string);
		pw.flush();
		pw.close();
	}
	
	public static boolean isLong(String s) {
		try {
			Long.parseLong(s);
		}
		catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
	
	public static void combineFilesWithHeader(String dirName) throws Exception {
		File dir = new File(dirName);
		File[] files = dir.listFiles();
		PrintWriter pw = new PrintWriter(dirName + ".txt");
		for(int i=0; i<files.length; i++) {
			if(i == 0) {
				combineFileWithHeader(files[i], pw, true);
			}
			else {
				combineFileWithHeader(files[i], pw, false);
			}
		}
		pw.flush();
		pw.close();
	}

	public static void combineFileWithHeader(File f, PrintWriter pw, boolean writeHeader) throws Exception {
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = lnr.readLine();
		if(writeHeader) {
			pw.println(s);
		}
		while ((s=lnr.readLine()) != null) {
			if(s.length() > 0) {
				pw.println(s);
			}
		}					
		lnr.close();
		isr.close();
		fis.close();
	}

	public static void combineFiles(String dirName, String encoding) throws Exception {
		File dir = new File(dirName);
		File[] files = dir.listFiles();
		FileOutputStream fos = new FileOutputStream(dirName + ".txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, encoding);
		BufferedWriter bw = new BufferedWriter(osw);
		for(int i=0; i<files.length; i++) {
			combineFile(files[i], encoding, bw);
			//bw.write("\n");
		}
		bw.flush();
		bw.close();
		osw.close();
		fos.close();
	}

	public static void combineFile(File f, String encoding, BufferedWriter bw) throws Exception {
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(fis, encoding);
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			if(s.length() > 0) {
				bw.write(s + "\n");
				//bw.write(s);
			}
		}					
		lnr.close();
		isr.close();
		fis.close();
	}

	public static void combineFiles(String dirName) throws Exception {
		File dir = new File(dirName);
		File[] files = dir.listFiles();
		PrintWriter pw = new PrintWriter(dirName + ".txt");
		for(int i=0; i<files.length; i++) {
			combineFile(files[i], pw);
		}
		pw.flush();
		pw.close();
	}

	public static void combineFile(File f, PrintWriter pw) throws Exception {
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			if(s.length() > 0) {
				pw.println(s);
			}
		}					
		lnr.close();
		isr.close();
		fis.close();
	}

	// Split a data file to two
	public static void splitFile(String inputFileName, String outputFileName1, String outputFileName2, int line, boolean duplicateHeader) throws Exception {
		PrintWriter pw1 = new PrintWriter(outputFileName1);
		PrintWriter pw2 = new PrintWriter(outputFileName2);
		FileInputStream fis = new FileInputStream(inputFileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		int count = 0;
		
		if(duplicateHeader == true) {
			s = lnr.readLine();
			pw1.println(s);
			pw2.println(s);
		}

		while ((s=lnr.readLine()) != null) {
			if(count < line) {
				pw1.println(s);
			}
			else {
				pw2.println(s);
			}
			count++;
		}
					
		lnr.close();
		isr.close();
		fis.close();
		pw1.flush();
		pw1.close();
		pw2.flush();
		pw2.close();
	}
	
	// Extract first portion of a data file
	public static void extractFile(String fileName, int line) throws Exception {
		String[] t = fileName.split("\\.");
		extractFile(fileName, t[0] + "_" + line + "." + t[1], line);
	}

	// Extract first portion of a data file
	public static void extractFile(String inputFileName, String outputFileName, int line) throws Exception {
		PrintWriter pw = new PrintWriter(outputFileName);
		FileInputStream fis = new FileInputStream(inputFileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		int count = 0;
		String s = null;

		while ((s=lnr.readLine()) != null) {
			if(count < line) {
				pw.println(s);
			}
			else {
				break;
			}
			count++;
		}
					
		lnr.close();
		isr.close();
		fis.close();
		pw.flush();		
		pw.close();
	}
	
	public static String getFileLine(String fileName, int line) throws Exception {
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		int count = 0;
		String s = null;
		while ((s=lnr.readLine()) != null) {
			if(count == line) {
				break;
			}
			count++;
		}					
		lnr.close();
		isr.close();
		fis.close();
		return s;
	}
	
	public static String getFileFirstLine(String fileName) throws Exception {
		return getFileLine(fileName, 0);
	}

	public static void removeFileLine(String inputFileName, String outputFileName, int line, String encoding) throws Exception {
		FileInputStream fis = new FileInputStream(inputFileName);
		InputStreamReader isr = new InputStreamReader(fis, encoding);
		LineNumberReader lnr = new LineNumberReader(isr);
		FileOutputStream fos = new FileOutputStream(outputFileName);
		OutputStreamWriter osw = new OutputStreamWriter(fos, encoding);
		BufferedWriter bw = new BufferedWriter(osw);
		int count = 0;
		String s = null;
		while ((s=lnr.readLine()) != null) {
			if(count != line) {
				bw.write(s + "\n");
			}
			count++;
		}					
		bw.flush();
		bw.close();
		osw.close();
		fos.close();
		lnr.close();
		isr.close();
		fis.close();
	}

	public static void replaceFileLine(String inputFileName, String outputFileName, int line, String newText, String encoding) throws Exception {
		FileInputStream fis = new FileInputStream(inputFileName);
		InputStreamReader isr = new InputStreamReader(fis, encoding);
		LineNumberReader lnr = new LineNumberReader(isr);
		FileOutputStream fos = new FileOutputStream(outputFileName);
		OutputStreamWriter osw = new OutputStreamWriter(fos, encoding);
		BufferedWriter bw = new BufferedWriter(osw);
		int count = 0;
		String s = null;
		while ((s=lnr.readLine()) != null) {
			if(count == line) {
				bw.write(newText + "\n");
			}
			else {
				bw.write(s + "\n");
			}
			count++;
		}					
		bw.flush();
		bw.close();
		osw.close();
		fos.close();
		lnr.close();
		isr.close();
		fis.close();
	}
	
	public static void replaceFileLine(String inputFileName, String outputFileName, String oldText, String newText, String encoding) throws Exception {
		FileInputStream fis = new FileInputStream(inputFileName);
		InputStreamReader isr = new InputStreamReader(fis, encoding);
		LineNumberReader lnr = new LineNumberReader(isr);
		FileOutputStream fos = new FileOutputStream(outputFileName);
		OutputStreamWriter osw = new OutputStreamWriter(fos, encoding);
		BufferedWriter bw = new BufferedWriter(osw);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			if(s.equalsIgnoreCase(oldText)) {
				bw.write(newText + "\n");
			}
			else {
				bw.write(s + "\n");
			}
		}					
		bw.flush();
		bw.close();
		osw.close();
		fos.close();
		lnr.close();
		isr.close();
		fis.close();
	}
	
	public static String getFileLine(String fileName, int line, String encoding) throws Exception {
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, encoding);
		LineNumberReader lnr = new LineNumberReader(isr);
		int count = 0;
		String s = null;
		while ((s=lnr.readLine()) != null) {
			if(count == line) {
				break;
			}
			count++;
		}					
		lnr.close();
		isr.close();
		fis.close();
		return s;
	}
	
	public static String getFileFirstLine(String fileName, String encoding) throws Exception {
		return getFileLine(fileName, 0, encoding);
	}
	
	public static int getFileLineNumber(String fileName) throws Exception {
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		int count = 0;
		while (lnr.readLine() != null) {
			count++;
		}
		lnr.close();
		isr.close();
		fis.close();
		return count;
	}
	
	public static int getFileLineNumberWithTargetString(String fileName, String target) throws Exception {
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		int count = 0;
		while ((s=lnr.readLine()) != null) {
			if(s.contains(target)) {
				break;
			}
			count++;
		}					
		lnr.close();
		isr.close();
		fis.close();
		return count;
	}	

	public static void saveObject(String fileName, Object obj) throws Exception {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.flush();
		oos.close();
	}

	public static Object loadObject(String fileName) throws Exception {
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		ois.close();
		return obj;
	}
	
	public static String loadString(String fileName) throws Exception {
		String result = new String();
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			result += (s + "\n");
		}					
		lnr.close();
		isr.close();
		fis.close();
		return result;
	}	
	
	public static TreeMap<Integer, Integer> computeFrequencyMap(int[] data) {
		TreeMap<Integer, Integer> frequencyMap = new TreeMap<Integer, Integer>();
		for(int i=0; i<data.length; i++) {
			Integer d = data[i];
			Integer c  = frequencyMap.get(d);
			if(c == null) {
				frequencyMap.put(d, 1);
			}
			else {
				frequencyMap.put(d, c+1);
			}
		}
		return frequencyMap;
	}

	public static double computeCosine(double[] data1, double[] data2) {
		double dp = 0.0;
		double m1 = 0.0;
		double m2 = 0.0;
		for(int i=0; i<data1.length; i++) {
			dp += data1[i]*data2[i];
			m1 += data1[i]*data1[i];
			m2 += data2[i]*data2[i];
		}
		m1 = Math.sqrt(m1);
		m2 = Math.sqrt(m2);
		double cosine = (double)dp/(double)(m1*m2);
		if(Double.isNaN(cosine)) {
			return 0.0;
		}
		else {
			return cosine;
		}
	}

	public static double computeEntropy(double[] data) {
		double entropy = 0.0;
		data = getNormalizedSumScoreArray(data);
		for(int i=0; i<data.length; i++) {
			if(data[i] != 0) {
				entropy -= data[i] * Math.log(data[i]);
			}
		}
		if(Double.isNaN(entropy)) {
			return 0.0;
		}
		else {
			return entropy;
		}
	}

	public static double computeHellinger(double[] data1, double[] data2) {
		double hellinger = 0.0;
		for(int i=0; i<data1.length; i++) {
			hellinger += Math.pow(Math.sqrt(data1[i]) - Math.sqrt(data2[i]), 2);
		}
		if(Double.isNaN(hellinger)) {
			return 0.0;
		}
		else {
			return hellinger;
		}
	}
	
	public static double computeJaccard(long[] data1, long[] data2) {
		int intersection = 0;
		for(int i=0; i<data1.length; i++) {
			for(int j=0; j<data2.length; j++) {
				if(data1[i] == data2[j]) {
					intersection++;
					break;
				}
			}
		}
		int union = data1.length + data2.length - intersection;
		return (double)intersection/(double)union;
	}

	public static void saveStringTreeSet(TreeSet<String> ts, String fileName) throws Exception {
		FileOutputStream fos = new FileOutputStream(fileName);
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		for(String s : ts) {
			bw.write(s + "\n");
		}
		bw.flush();
		bw.close();
		osw.close();
		fos.close();
	}

	public static void saveTreeSet(TreeSet<?> ts, String fileName) throws Exception {
		PrintWriter pw = new PrintWriter(fileName);
		for(Object o : ts) {
			pw.println(o);
		}
		pw.flush();
		pw.close();
	}

	public static void saveIntegerTreeSet(TreeSet<Integer> ts, String fileName) throws Exception {
		PrintWriter pw = new PrintWriter(fileName);
		for(Integer i : ts) {
			pw.println(i);
		}
		pw.flush();
		pw.close();
	}

	public static void saveFrequencyMap(TreeMap<Integer, Integer> frequencyMap, String fileName) throws Exception {
		saveIntegerToIntegerTreeMap(frequencyMap, fileName);
	}
	
	public static void saveLongToIntegerTreeMap(TreeMap<Long, Integer> treeMap, String fileName) throws Exception {
		PrintWriter pw = new PrintWriter(fileName);
		for(Long k : treeMap.keySet()) {
			pw.println(k + "," + treeMap.get(k));
		}
		pw.flush();
		pw.close();
	}

	public static void saveLongToStringTreeMap(TreeMap<Long, String> treeMap, String fileName) throws Exception {
		PrintWriter pw = new PrintWriter(fileName);
		for(Long k : treeMap.keySet()) {
			pw.println(k + "," + treeMap.get(k));
		}
		pw.flush();
		pw.close();
	}

	public static void saveIntegerToIntegerTreeMap(TreeMap<Integer, Integer> treeMap, String fileName) throws Exception {
		PrintWriter pw = new PrintWriter(fileName);
		for(Integer k : treeMap.keySet()) {
			pw.println(k + "," + treeMap.get(k));
		}
		pw.flush();
		pw.close();
	}

	public static void saveIntegerToDoubleTreeMap(TreeMap<Integer, Double> treeMap, String fileName) throws Exception {
		PrintWriter pw = new PrintWriter(fileName);
		for(Integer k : treeMap.keySet()) {
			pw.println(k + "," + treeMap.get(k));
		}
		pw.flush();
		pw.close();
	}

	public static void saveIntegerToStringTreeMap(TreeMap<Integer, String> treeMap, String fileName) throws Exception {
		PrintWriter pw = new PrintWriter(fileName);
		for(Integer k : treeMap.keySet()) {
			pw.println(k + "," + treeMap.get(k));
		}
		pw.flush();
		pw.close();
	}

	public static void saveStringToIntegerTreeMap(TreeMap<String, Integer> treeMap, String fileName) throws Exception {
		PrintWriter pw = new PrintWriter(fileName);
		for(String k : treeMap.keySet()) {
			pw.println(k + "," + treeMap.get(k));
		}
		pw.flush();
		pw.close();
	}

	public static TreeMap<Integer, Integer> loadFrequencyMap(String fileName) throws Exception {
		return loadIntegerToIntegerTreeMap(fileName);
	}
	
	public static TreeMap<Integer, Integer> loadIntegerToIntegerTreeMap(String fileName) throws Exception {
		TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			String[] tokens = s.split(",");
			treeMap.put(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
		}					
		lnr.close();
		isr.close();
		fis.close();
		return treeMap;
	}

	public static TreeMap<Long, Integer> loadLongToIntegerTreeMap(String fileName) throws Exception {
		TreeMap<Long, Integer> treeMap = new TreeMap<Long, Integer>();
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			String[] tokens = s.split(",");
			treeMap.put(Long.parseLong(tokens[0]), Integer.parseInt(tokens[1]));
		}					
		lnr.close();
		isr.close();
		fis.close();
		return treeMap;
	}

	public static TreeMap<Long, Double> loadLongToDoubleTreeMap(String fileName) throws Exception {
		TreeMap<Long, Double> treeMap = new TreeMap<Long, Double>();
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			String[] tokens = s.split(",");
			treeMap.put(Long.parseLong(tokens[0]), Double.parseDouble(tokens[1]));
		}					
		lnr.close();
		isr.close();
		fis.close();
		return treeMap;
	}

	public static TreeMap<Integer, Double> loadIntegerToDoubleTreeMap(String fileName) throws Exception {
		TreeMap<Integer, Double> treeMap = new TreeMap<Integer, Double>();
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			String[] tokens = s.split(",");
			treeMap.put(Integer.parseInt(tokens[0]), Double.parseDouble(tokens[1]));
		}					
		lnr.close();
		isr.close();
		fis.close();
		return treeMap;
	}

	public static TreeMap<Integer, String> loadIntegerToStringTreeMap(String fileName) throws Exception {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			String[] tokens = s.split(",");
			treeMap.put(Integer.parseInt(tokens[0]), tokens[1]);
		}					
		lnr.close();
		isr.close();
		fis.close();
		return treeMap;
	}
	
	public static TreeMap<String, Integer> loadStringToIntegerTreeMap(String fileName) throws Exception {
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			String[] tokens = s.split(",");
			treeMap.put(tokens[0], Integer.parseInt(tokens[1]));
		}					
		lnr.close();
		isr.close();
		fis.close();
		return treeMap;
	}

	public static TreeMap<String, String> loadStringToStringTreeMap(String fileName) throws Exception {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		FileInputStream fis = new FileInputStream(fileName);
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		LineNumberReader lnr = new LineNumberReader(isr);
		String s = null;
		while ((s=lnr.readLine()) != null) {
			String[] tokens = s.split(",");
			treeMap.put(tokens[0], tokens[1]);
		}					
		lnr.close();
		isr.close();
		fis.close();
		return treeMap;
	}

	public static void computeAndSaveFrequencyMap(int[] data, String fileName) throws Exception {
		saveFrequencyMap(computeFrequencyMap(data), fileName);
	}
	
	public static double computeErrorRate(double[] a, double[] b) {
		if(a.length != b.length) {
			System.out.println("Error, array length different.");
			return -1;
		}
		int error = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] != b[i]) {
				error++;
			}
		}
		return (double)error/(double)a.length;
	}
	
	public static double computeRMSE(double[] a, double[] b) {
		if(a.length != b.length) {
			System.out.println("Error, array length different.");
			return -1;
		}
		double[] c = new double[a.length];
		for(int i=0; i<a.length; i++) {
			c[i] = (a[i] - b[i]) * (a[i] - b[i]);
		}
		double mean = Utility.computeMean(c);
		return Math.sqrt(mean);
	}
	
	public static double[][] loadDoubleArrays(String[] fileNames) throws Exception {
		int number = fileNames.length;
		double[][] data = new double[number][];
		for(int i=0; i<number; i++) {
			data[i] = Utility.loadDoubleArray(fileNames[i]);
		}
		return data;
	}
		
	public static double[] averageEnsemble(double[][] data) throws Exception {
		int number = data.length;
		int size = data[0].length;
		double[] result = new double[size];
		for(int j=0; j<size; j++) {
			double sum = 0;
			for(int i=0; i<number; i++) {
				sum += data[i][j];
			}
			sum /= number;
			result[j] = sum;
		}
		return result;
	}
	
	public static double computeRankBasedAUC(double[] data, int max) {
		int[] acc = new int[max];
		double[] normAcc = new double[max];
		for(int i=0; i<max; i++) {
			for(int j=0; j<data.length; j++) {
				if(data[j] <= (i+1)) {
					acc[i]++;
				}
				normAcc[i] = (double)acc[i]/(double)data.length;
			}
		}
		return computeMean(normAcc);
	}
}
