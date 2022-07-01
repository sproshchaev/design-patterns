package com.prosoft;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Шаблон Command Pattern
 * Есть клиент и есть множество действий, которые заключены в FirstCommand(), SecondCommand() и т.п.,
 * реализующие интерфейс Command, в котором есть один метод execute() в результате этого мы можем выполнять различные
 * команды даже не зная, что эти команды делают
 *
 * Плюсы: команда инкапсулирует все необходимые действия и предоставляет единый интерфейс для выполнения.
 * Команды можно устанавливать в качестве обработчиков для различных действий. Имеется возможность гибко менять
 * обработчики
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new FirstCommand());
        executorService.execute(new SecondCommand());
    }
}
