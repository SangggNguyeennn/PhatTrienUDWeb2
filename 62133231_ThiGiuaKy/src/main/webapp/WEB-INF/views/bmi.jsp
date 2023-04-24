<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>BMI Calculator</title>
</head>
<body>
    <h1>BMI Calculator</h1>
    <form action="BMICalculator" method="post">
        <label for="weight">Weight:</label>
        <input type="number" id="weight" name="weight" required><br><br>
        <label for="height">Height:</label>
        <input type="number" step="0.01" id="height" name="height" required><br><br>
        <input type="submit" value="Calculate">
    </form>
    <br>
</body>
</html>