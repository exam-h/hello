package Instance;

public class Q03StatisticsCalculator {
	double[] numbers;
	private double sum; 
    private double average; 
    private double max; 
    private double min; 

    public Q03StatisticsCalculator(double[] numbers) {
		this.numbers = numbers;
		calculateSum();
		calculateAverage();
		calculateMax();
		calculateMin();
	}
	private void calculateSum() {
		sum = 0;
		for (double d : numbers) {
			sum += d;
		}
	}
	private void calculateAverage() {
		average = sum / numbers.length;
	}

	private void calculateMax() {
		max = numbers[0];
		for (double d : numbers) {
			if (d > max) {
				max = d;
			}
		}
	}

	private void calculateMin() {
		min = numbers[0];
		for (double d : numbers) {
			if (d < min) {
				min = d;
			}
		}
	}

	public double getSum() {
		return sum;
	}

	public double getAverage() {
		return average;
	}

	public double getMax() {
		return max;
	}

	public double getMin() {
		return min;
	}
}
