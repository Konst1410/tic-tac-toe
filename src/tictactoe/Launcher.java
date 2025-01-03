/*
 * Copyright (c) 2025. mrbald@bigmir.net
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package tictactoe;

import tictactoe.component.*;

/**
 * @author Konst
 * @link mrbald@bigmir.net
 */
public final class Launcher {
    public static void main(final String[] args) {
        final Game game = new Game(new DataPrinter(),
                new ComputerMove(), new UserMove(),
                new WinnerVerifier(), new DrawVerifier());
        game.play();

    }
}
