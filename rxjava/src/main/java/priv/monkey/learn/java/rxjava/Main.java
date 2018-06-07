package priv.monkey.learn.java.rxjava;

import io.reactivex.*;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.observables.GroupedObservable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author:Monkey
 * @time: Create on 2018/6/7
 */
public class Main {
    private static final String TAG = "Monkey";

    public static void main(String[] args) {
//        create();
//        just();
//        fromArray();
//        fromIterable();
//        fromCallable();
//        fromFuture();
//        defer();
//        timer(); \\开新线程
//        interval();\\开新线程
//        intervalRange();\\开新线程
//        range();
//        rangeLong();
//        empty();
//        never();
//        error(); 有问题
//        map();
//        flatMap();
//        concatMap();
//        buffer();
//        groupBy();
//        scan();
//        window();
//        concat();
//        concatArray();
//        merge();
//        mergeArray();
//        concatArrayDelyError();
//        mergeArrayDelyError();
        zip();

    }

    private static void zip() {
        Observable.zip(Observable.intervalRange(1, 5, 1, 1, TimeUnit.SECONDS)
                        .map(new Function<Long, String>() {
                            @Override
                            public String apply(Long aLong) throws Exception {
                                String s1 = "A" + aLong;
                                System.out.println( "===================A 发送的事件 " + s1);
                                return s1;
                            }}),
                Observable.intervalRange(1, 6, 1, 1, TimeUnit.SECONDS)
                        .map(new Function<Long, String>() {
                            @Override
                            public String apply(Long aLong) throws Exception {
                                String s2 = "B" + aLong;
                                System.out.println( "===================B 发送的事件 " + s2);
                                return s2;
                            }
                        }),
                new BiFunction<String, String, String>() {
                    @Override
                    public String apply(String s, String s2) throws Exception {
                        String res = s + s2;
                        return res;
                    }
                })
                .subscribe(new Observer<String>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println( "===================onSubscribe ");
                    }

                    @Override
                    public void onNext(String s) {
                        System.out.println( "===================onNext " + s);
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println( "===================onError ");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println( "===================onComplete ");
                    }
                });

    }

    private static void mergeArrayDelyError() {
        Observable.mergeArrayDelayError(
                Observable.create(new ObservableOnSubscribe < Integer > () {
                    @Override
                    public void subscribe(ObservableEmitter < Integer > e) throws Exception {
                        e.onNext(1);
                        e.onError(new NumberFormatException());
                    }
                }), Observable.just(2, 3, 4))
                .subscribe(new Observer < Integer > () {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Integer integer) {
                        System.out.println( "===================onNext " + integer);
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println( "===================onError ");
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private static void concatArrayDelyError() {
        Observable.concatArrayDelayError(
                Observable.create(new ObservableOnSubscribe < Integer > () {
                    @Override
                    public void subscribe(ObservableEmitter < Integer > e) throws Exception {
                        e.onNext(1);
                        e.onError(new NumberFormatException());
                    }
                }), Observable.just(2, 3, 4))
                .subscribe(new Observer < Integer > () {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Integer integer) {
                        System.out.println( "===================onNext " + integer);
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println( "===================onError ");
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private static void mergeArray() {
        Observable.mergeArray(
                Observable.interval(1, TimeUnit.SECONDS).map(new Function < Long, String > () {
                    @Override
                    public String apply(Long aLong) throws Exception {
                        return "A" + aLong;
                    }
                }),
                Observable.interval(1, TimeUnit.SECONDS).map(new Function < Long, String > () {
                    @Override
                    public String apply(Long aLong) throws Exception {
                        return "B" + aLong;
                    }
                }))
                .subscribe(new Observer < String > () {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(String s) {
                        System.out.println( "=====================onNext " + s);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private static void merge() {
        Observable.merge(
                Observable.interval(1, TimeUnit.SECONDS).map(new Function < Long, String > () {
                    @Override
                    public String apply(Long aLong) throws Exception {
                        return "A" + aLong;
                    }
                }),
                Observable.interval(1, TimeUnit.SECONDS).map(new Function < Long, String > () {
                    @Override
                    public String apply(Long aLong) throws Exception {
                        return "B" + aLong;
                    }
                }))
                .subscribe(new Observer < String > () {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(String s) {
                        System.out.println( "=====================onNext " + s);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private static void concatArray() {
        Observable.concatArray(Observable.just(1, 2),
                Observable.just(3, 4),
                Observable.just(5, 6),
                Observable.just(7, 8),
                Observable.just(9, 10))
                .subscribe(new Observer < Integer > () {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Integer integer) {
                        System.out.println( "================onNext " + integer);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

    private static void concat(){
        Observable.concat(Observable.just(1, 2),
                Observable.just(3, 4),
                Observable.just(5, 6),
                Observable.just(7, 8))
                .subscribe(new Observer < Integer > () {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Integer integer) {
                        System.out.println( "================onNext " + integer);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }


    private static void window() {
        Observable.just(1, 2, 3, 4, 5)
                .window(2)
                .subscribe(new Observer < Observable < Integer >> () {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println( "=====================onSubscribe ");
                    }

                    @Override
                    public void onNext(Observable < Integer > integerObservable) {
                        integerObservable.subscribe(new Observer < Integer > () {
                            @Override
                            public void onSubscribe(Disposable d) {
                                System.out.println( "=====================integerObservable onSubscribe ");
                            }

                            @Override
                            public void onNext(Integer integer) {
                                System.out.println( "=====================integerObservable onNext " + integer);
                            }

                            @Override
                            public void onError(Throwable e) {
                                System.out.println( "=====================integerObservable onError ");
                            }

                            @Override
                            public void onComplete() {
                                System.out.println( "=====================integerObservable onComplete ");
                            }
                        });
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println( "=====================onError ");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println( "=====================onComplete ");
                    }
                });
    }

    private static void scan() {
        Observable.just(1, 2, 3, 4, 5)
                .scan(new BiFunction< Integer, Integer, Integer >() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) throws Exception {
                        System.out.println( "====================apply ");
                        System.out.println( "====================integer1= " + integer);
                        System.out.println( "====================integer2= " + integer2);
                        return integer + integer2;
                    }
                })
                .subscribe(new Consumer < Integer > () {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        System.out.println( "====================accept " + integer);
                    }
                });
    }

    private static void groupBy() {
        Observable.just(1,2,3,4,5,6,7,8,9,10)
                .groupBy(new Function < Integer, Integer > () {
                    @Override
                    public Integer apply(Integer integer) throws Exception {
                        return integer % 3;
                    }
                })
                .subscribe(new Observer <GroupedObservable< Integer, Integer >> () {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println( "====================onSubscribe ");
                    }

                    @Override
                    public void onNext(GroupedObservable < Integer, Integer > integerIntegerGroupedObservable) {
                        System.out.println( "====================onNext ");
                        integerIntegerGroupedObservable.subscribe(new Observer < Integer > () {
                            @Override
                            public void onSubscribe(Disposable d) {
                                System.out.println( "====================GroupedObservable onSubscribe ");
                            }

                            @Override
                            public void onNext(Integer integer) {
                                System.out.println( "====================GroupedObservable onNext  groupName: " + integerIntegerGroupedObservable.getKey() + " value: " + integer);
                            }

                            @Override
                            public void onError(Throwable e) {
                                System.out.println( "====================GroupedObservable onError ");
                            }

                            @Override
                            public void onComplete() {
                                System.out.println( "====================GroupedObservable onComplete ");
                            }
                        });
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println( "====================onError ");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println( "====================onComplete ");
                    }
                });
    }

    private static void buffer() {
        Observable.just(1, 2, 3, 4, 5)
                .buffer(2, 2)
                .subscribe(new Observer < List < Integer >> () {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(List < Integer > integers) {
                        System.out.println( "================缓冲区大小： " + integers.size());
                        for (Integer i: integers) {
                            System.out.println( "================元素： " + i);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private static void concatMap() {
        List<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");

        List<String> strings1 = new ArrayList<>();
        strings.add("aaa1");
        strings.add("bbb1");
        strings.add("ccc1");

        List<Plan> plans = new ArrayList<>();
        plans.add(new Plan("plan", "content1", strings));
//        plans.add(new Plan("plan2", "content", strings));

        List<Plan> plans1 = new ArrayList<>();
        plans1.add(new Plan("plan1", "content2", strings1));


        List<Person> personList = new ArrayList<>();
        personList.add(new Person("111",plans));
        personList.add(new Person("222",plans1));

//        Observable.fromIterable(personList)
//                .flatMap(new Function < Person, ObservableSource < Plan >> () {
//                    @Override
//                    public ObservableSource < Plan > apply(Person person) {
//                        if ("111".equals(person.getName())) {
//                            return Observable.fromIterable(person.getPlanList()).delay(10, TimeUnit.MILLISECONDS);
//                        }
//                        return Observable.fromIterable(person.getPlanList());
//                    }
//                })
//                .subscribe(new Observer < Plan > () {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(Plan plan) {
//                        System.out.println( "==================plan " + plan.getContent());
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });

        Observable.fromIterable(personList)
                .concatMap(new Function < Person, ObservableSource < Plan >> () {
                    @Override
                    public ObservableSource < Plan > apply(Person person) {
                        if ("111".equals(person.getName())) {
                            return Observable.fromIterable(person.getPlanList()).delay(10, TimeUnit.MILLISECONDS);
                        }
                        return Observable.fromIterable(person.getPlanList());
                    }
                })
                .subscribe(new Observer < Plan > () {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Plan plan) {
                        System.out.println( "==================plan " + plan.getContent());
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private static void flatMap() {
        List<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");

        List<Plan> plans = new ArrayList<>();
        plans.add(new Plan("plan1", "content", strings));
        plans.add(new Plan("plan2", "content", strings));

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("111",plans));
        personList.add(new Person("222",plans));

        //如果用map的话
//        Observable.fromIterable(personList)
//                .map(new Function < Person, List < Plan >> () {
//                    @Override
//                    public List < Plan > apply(Person person) throws Exception {
//                        return person.getPlanList();
//                    }
//                })
//                .subscribe(new Observer < List < Plan >> () {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(List < Plan > plans) {
//                        for (Plan plan: plans) {
//                            List < String > planActionList = plan.getActionList();
//                            for (String action: planActionList) {
//                                System.out.println( "==================action " + action);
//                            }
//                        }
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });

        //如果用flatMap的话
        Observable.fromIterable(personList)
                .flatMap(new Function < Person, ObservableSource < Plan >> () {
                    @Override
                    public ObservableSource < Plan > apply(Person person) {
                        return Observable.fromIterable(person.getPlanList());
                    }
                })
                .flatMap(new Function < Plan, ObservableSource < String >> () {
                    @Override
                    public ObservableSource < String > apply(Plan plan) throws Exception {
                        return Observable.fromIterable(plan.getActionList());
                    }
                })
                .subscribe(new Observer < String > () {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(String s) {
                        System.out.println( "==================action: " + s);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });


    }

    private static void map() {
        Observable.just(1, 2, 3)
                .map(new Function< Integer, String >() {
                    @Override
                    public String apply(Integer integer) throws Exception {
                        return "I'm " + integer;
                    }
                })
                .subscribe(new Observer < String > () {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println( "===================onSubscribe");
                    }

                    @Override
                    public void onNext(String s) {
                        System.out.println( "===================onNext " + s);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

//    private static void error() {
//        Observable.error()
//        .subscribe(new Observer < Object > () {
//
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        System.out.println( "==================onSubscribe");
//                    }
//
//                    @Override
//                    public void onNext(Object o) {
//                        System.out.println( "==================onNext");
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        System.out.println( "==================onError " + e);
//                    }
//
//                    @Override
//                    public void onComplete() {
//                        System.out.println( "==================onComplete");
//                    }
//                });
//    }

    private static void never() {
        Observable.never()
                .subscribe(new Observer < Object > () {

                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println( "==================onSubscribe");
                    }

                    @Override
                    public void onNext(Object o) {
                        System.out.println( "==================onNext");
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println( "==================onError " + e);
                    }

                    @Override
                    public void onComplete() {
                        System.out.println( "==================onComplete");
                    }
                });
    }

    private static void empty() {
        Observable.empty()
                .subscribe(new Observer < Object > () {

                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println( "==================onSubscribe");
                    }

                    @Override
                    public void onNext(Object o) {
                        System.out.println( "==================onNext");
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println( "==================onError " + e);
                    }

                    @Override
                    public void onComplete() {
                        System.out.println( "==================onComplete");
                    }
                });
    }

    private static void rangeLong() {
        Observable.rangeLong(1000001, 5)
                .subscribe(new Observer < Long > () {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println( "==============onSubscribe ");
                    }

                    @Override
                    public void onNext(Long aLong) {
                        System.out.println( "==============onNext " + aLong);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private static void range() {
        Observable.range(3, 5)
                .subscribe(new Observer < Integer > () {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println( "==============onSubscribe ");
                    }

                    @Override
                    public void onNext(Integer aLong) {
                        System.out.println( "==============onNext " + aLong);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private static void intervalRange() {
        Logger logger = Logger.getLogger("Monkdy");
        Observable.intervalRange(2, 5, 2, 1, TimeUnit.SECONDS)
                .subscribe(new Observer < Long > () {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println( "==============onSubscribe ");
                    }

                    @Override
                    public void onNext(Long aLong) {
                        System.out.println( "==============onNext " + aLong);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private static void interval() {

        Observable.interval(2, 1, TimeUnit.SECONDS)
                // 该例子发送的事件序列特点：延迟3s后发送事件，每隔1秒产生1个数字（从0开始递增1，无限个）
                .subscribe(new Observer<Long>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println("开始采用subscribe连接");
                    }
                    // 默认最先调用复写的 onSubscribe（）

                    @Override
                    public void onNext(Long value) {
                        System.out.println("接收到了事件" + value);
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println("对Error事件作出响应");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("对Complete事件作出响应");
                    }

                });
    }

    private static void timer() {
        Observable.timer(2, TimeUnit.SECONDS)
                .subscribe(new Observer<Long>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Long aLong) {
                        System.out.println("===============onNext " + aLong);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private static void defer() {
        // i 要定义为成员变量
        final Integer i = 100;
//        Observable<Integer> observable = Observable.defer(new Func0<Observable<Integer>>() {
//            @Override
//            public Observable<Integer> call() throws Exception {
//                return Observable.just(i);
//            }
//        });

        Observable<Integer> observable = Observable.defer(new Callable<ObservableSource<? extends Integer>>() {
            @Override
            public ObservableSource<? extends Integer> call() throws Exception {
                return Observable.just(i);
            }
        });

//        i = 200;

        Observer observer = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("================onNext " + integer);
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        };

        observable.subscribe(observer);

//        i = 300;

        observable.subscribe(observer);
    }

    private static void fromFuture() {


        FutureTask<String> futureTask = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("CallableDemo is Running");
                return "返回结果";
            }
        });

        Observable.fromFuture(futureTask)
                .doOnSubscribe(new Consumer<Disposable>() {
                    @Override
                    public void accept(Disposable disposable) throws Exception {
                        futureTask.run();
                    }
                })
                .subscribe(new Consumer<String>() {
                    @Override
                    public void accept(String s) throws Exception {
                        System.out.println("================accept " + s);
                    }
                });
    }

    private static void fromCallable() {
        Observable.fromCallable(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                return 1;
            }
        })
                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        System.out.println("================accept " + integer);
                    }
                });
    }

    private static void fromIterable() {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        Observable.fromIterable(list)
                .subscribe(new Observer<Integer>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println("=================onSubscribe");
                    }

                    @Override
                    public void onNext(Integer integer) {
                        System.out.println("=================onNext " + integer);
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println("=================onError ");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("=================onComplete ");
                    }
                });

    }

    private static void fromArray() {
        Integer array[] = {1, 2, 3, 4};
        Observable.fromArray(array)
                .subscribe(new Observer<Integer>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println("=================onSubscribe");
                    }

                    @Override
                    public void onNext(Integer integer) {
                        System.out.println("=================onNext " + integer);
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println("=================onError ");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("=================onComplete ");
                    }
                });
    }


    private static void just() {
        Observable.just(1, 2, 3)
                .subscribe(new Observer<Integer>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        System.out.println("=================onSubscribe");
                    }

                    @Override
                    public void onNext(Integer integer) {
                        System.out.println("=================onNext " + integer);
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println("=================onError ");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("=================onComplete ");
                    }
                });

    }

    private static void create() {
        Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
                System.out.println("=========================currentThread name: " + Thread.currentThread().getName());
                e.onNext(1);
                e.onNext(2);
                e.onNext(3);
                e.onComplete();
            }
        }).subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                System.out.println("======================onSubscribe");
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("======================onNext " + integer);
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("======================onError");
            }

            @Override
            public void onComplete() {
                System.out.println("======================onComplete");
            }
        });
    }
}
