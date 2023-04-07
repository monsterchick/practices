from flask import Flask, jsonify, request, render_template

app = Flask(__name__)


@app.route('/')
def index():
    return render_template('index.html')


@app.route('/calculate')
def calculate():
    num1 = request.args.get('num1', type=float)
    num2 = request.args.get('num2', type=float)
    operator = request.args.get('operator')

    if operator == '+':
        result = num1 + num2
    elif operator == '-':
        result = num1 - num2
    elif operator == '*':
        result = num1 * num2
    elif operator == '/':
        result = num1 / num2
    else:
        return jsonify({'error': 'Invalid operator'})

    return jsonify({'result': result})


if __name__ == '__main__':
    app.run()
