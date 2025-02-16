package org.example.domain.activity.service.trial;

import org.example.domain.activity.adapter.repository.IActivityRepository;
import org.example.domain.activity.service.trial.factory.DefaultActivityStrategyFactory;
import org.example.types.framework.tree.AbstractMultiThreadStrategyRouterr;

import javax.annotation.Resource;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public abstract class AbstractGroupBuyMarketSupport<MarketProductEntity, DynamicContext, TrialBalanceEntity> extends AbstractMultiThreadStrategyRouterr<MarketProductEntity, DefaultActivityStrategyFactory.DynamicContext, TrialBalanceEntity> {



    protected long timeout = 500;
    @Resource
    protected IActivityRepository repository;
    @Override
    protected void multiThread(MarketProductEntity requestParameter, DefaultActivityStrategyFactory.DynamicContext dynamicContext) throws ExecutionException, InterruptedException, TimeoutException {

    }
}