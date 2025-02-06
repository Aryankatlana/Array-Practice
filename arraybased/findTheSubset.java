import java.util.ArrayList;
import java.util.List;
public class findTheSubset {
    //Here by using arrayList
    public static void find(List<Integer> al1 , List<Integer> al2)
    {
        int c = 0 ;
        for(int i : al1)
        {
            if(al2.contains(i))
            {
                c++;
            } 
            else
            {
                break;
            }

        }

        if(c==al1.size())
        {
            System.out.println("arr1 is Subset of arr2");
        }
        else
        {
            System.out.println("arr1 is not Subset of arr2");
        }

    }
    public static void main(String args[])
    {
        List<Integer> al1 = List.of(1,2,3,4,1);
        List<Integer> al2 = List.of(1,2,4,5,6);
        find(al1,al2);
    }
}

// Here without using ArrayLsit
// public class findTheSubset {
//     public static void find(int arr1[] , int arr2[])
//     {
//         int c = 0 ;
//         for(int i = 0 ; i < arr1.length ; i++)
//         {
//             for(int j = 0 ; j < arr2.length ; j++)
//             {
//                 if(arr1[i] == arr2[j])
//                 {
//                     break;
//                 }
//                 else if(arr1[i] != arr2[j] && j == (arr2.length-1))
//                 {
//                     c++;
//                 }
//             }
//             if(c > 0)
//                 {
//                     break;
//                 }
//         }

//         if(c==0)
//         {
//             System.out.println("arr1 is Subset of arr2");
//         }
//         else
//         {
//             System.out.println("arr1 is not Subset of arr2");
//         }

//     }
//     public static void main(String args[])
//     {
//         int arr1[] = new int[]{1,2,3,1,2};
//         int arr2[] = new int[]{1,2,3,};
//         find(arr1, arr2);
//     }
// }

