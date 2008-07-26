package org.jetlang.core;

public class PerfCommandExecutor implements ICommandExecutor {

    public void executeAll(Runnable[] toExecute) {
        for (Runnable runnable : toExecute) {
            runnable.run();
        }
        if (toExecute.length < 1000) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

//    public class StubCommandContext : ICommandTimer
//    {
//        public List<Command> Scheduled = new List<Command>();
//
//        public ITimerControl Schedule(Command command, long firstIntervalInMs)
//        {
//            Scheduled.Add(command);
//            return null;
//        }
//
//        public ITimerControl ScheduleOnInterval(Command command, long firstIntervalInMs, long regularIntervalInMs)
//        {
//            Scheduled.Add(command);
//            return null;
//        }
//    }
//}