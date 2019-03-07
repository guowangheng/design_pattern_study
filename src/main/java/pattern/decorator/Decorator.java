package pattern.decorator;

/**
 * create by: WeanGuo
 * description: 被装饰后类
 * create time: 2019/3/7 16:05
 */
public class Decorator extends DecorSkill{

    private Skill skill;

    public Decorator(Skill skill) {
        this.skill = skill;
    }

    @Override
    public void can() {
        System.out.println("小明先吃水果");
        skill.can();
    }
}
