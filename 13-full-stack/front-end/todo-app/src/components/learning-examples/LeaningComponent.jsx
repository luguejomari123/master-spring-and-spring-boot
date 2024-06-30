import FirstComponent from './FirstComponent';
import SecondComponent from './SecondComponent';
import ThirdComponent from './ThirdComponent';
import FourthComponent from './FourthComponent';
import { FifthComponent } from './FirstComponent';
import LeaningJavaScript from './LearningJavaScript';

export default function LearningComponent(){
    return (
        <div className="LeaningComponent">
            <FirstComponent/>
            <SecondComponent/>
            <ThirdComponent/>
            <FourthComponent/>
            <FifthComponent/>
            <LeaningJavaScript/>
        </div>
    );
}