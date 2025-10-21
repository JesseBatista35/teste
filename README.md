from flask import Flask, jsonify, request

app = Flask(__name__)

# Rota simples para teste
@app.route('/')
def home():
    return jsonify({"mensagem": "API funcionando!"}), 200

# Endpoint GET de exemplo
@app.route('/usuarios', methods=['GET'])
def get_usuarios():
    usuarios = [
        {"id": 1, "nome": "Ana"},
        {"id": 2, "nome": "Bruno"},
        {"id": 3, "nome": "Carla"},
    ]
    return jsonify(usuarios), 200

# Endpoint POST de exemplo
@app.route('/usuarios', methods=['POST'])
def criar_usuario():
    dados = request.get_json()
    if not dados or 'nome' not in dados:
        return jsonify({"erro": "Campo 'nome' é obrigatório"}), 400

    novo_usuario = {"id": 4, "nome": dados['nome']}
    return jsonify(novo_usuario), 201

if __name__ == '__main__':
    # Rodar no modo debug para testes
    app.run(debug=True, port=5000)
