package terminal.executables;

import animals.Snake;

import zoo.Zoo;

public class CreateSnakeExecutable implements CommandExecutable{


        private Zoo zoo;
        private Snake snake;

        public CreateSnakeExecutable(Zoo zoo,Snake snake) {
            this.zoo = zoo;
            this.snake = snake;
        }

        @Override
        public void execute() {
            this.zoo.addSnake(this.snake);
        }
}
